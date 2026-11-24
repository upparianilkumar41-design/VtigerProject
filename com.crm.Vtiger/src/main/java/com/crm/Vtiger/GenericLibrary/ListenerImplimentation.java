package com.crm.Vtiger.GenericLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.google.common.io.Files;

public class ListenerImplimentation extends BaseClass implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	JavaUtility j = new JavaUtility();
	@Override
	public void onTestStart(ITestResult result) {
	String testname = result.getName();
	test=report.createTest(testname);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodname = result.getName();
		test.log(Status.PASS,methodname+"Test script passed successfully");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name = result.getName();
		test.log(Status.FAIL,name+"Test script failed");
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		//JavaUtility j = new JavaUtility();
		String dateandtime = j.getDateAndTime("dd-MM-yy hh-mm-ss");
		File dest = new File("./Screenshots/"+name+".png");

		try {
			Files.copy(src, dest);
			test.addScreenCaptureFromPath(dest.getAbsolutePath(),name+"Failure Screenshot");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	String name = result.getName();
	test.log(Status.SKIP,name+"Test script skipped");
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		//ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		String dateandtimestamp = j.getDateAndTime("dd-MM-yyyy hh-mm-ss");
		ExtentSparkReporter reporter = new ExtentSparkReporter("./ExtentReports/report"+dateandtimestamp+".html");
		reporter.config().setDocumentTitle("Vtiger Organization Report");
		reporter.config().setReportName("Execution Details");
		reporter.config().setTheme(Theme.STANDARD);
		report = new ExtentReports();
		report.attachReporter(reporter);
		report.setSystemInfo("url", "http://localhost:8888/index.php");
		report.setSystemInfo("OS","Windows");
		report.setSystemInfo("Browser","Chrome");
		report.setSystemInfo("TestEngineer","ANIL KUMAR");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}

}
