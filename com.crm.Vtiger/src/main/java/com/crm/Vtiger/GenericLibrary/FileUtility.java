package com.crm.Vtiger.GenericLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author ANIL KUMAR
 * this class is a generic class which is used to read data from properties and excel file.
 */
public class FileUtility {
	/**
	 * this class is a generic class which is used to read data from properties file.
	 * @param key
	 * @return
	 * @throws IOException 
	 */
public String readDataFromProperty(String key) throws IOException {
	FileInputStream fis = new FileInputStream(ipathconstants.propretypath);
	Properties p = new Properties();
	p.load(fis);
	String data = p.getProperty(key);
	return data;
}
/**
 * this class is a generic class which is used to read string data from excel file
 * @param sheet
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public String readDataFromExcelString(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(ipathconstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return data;
}

/**
 * this class is a generic class which is used to read Numeric data from excel file
 * @param sheet
 * @param row
 * @param cell
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */
public double readDataFromExcelNumeric(String sheet,int row,int cell) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream(ipathconstants.ExcelPath);
	Workbook wb = WorkbookFactory.create(fis);
	double data = wb.getSheet(sheet).getRow(row).getCell(cell).getNumericCellValue();
	return data;
}
}




