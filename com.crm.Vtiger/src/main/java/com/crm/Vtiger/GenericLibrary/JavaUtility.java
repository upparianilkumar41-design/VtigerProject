package com.crm.Vtiger.GenericLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaUtility {
public String getDateAndTime(String pattern) {
	Calendar c = Calendar.getInstance();
	Date date = c.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat(pattern);
	String value = sdf.format(date);
	return value;
}
}
