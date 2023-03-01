package com.actitime.gentric;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class FileLib {
	

	public String getproperty(String key) throws IOException {
		FileInputStream f=new FileInputStream("./data/actitimenew.property");
		Properties p=new Properties();
		p.load(f);
		String data=p.getProperty(key);
		return data;	
	}
	
	public String getexclfile(String sheetname,int row,int cell) throws IOException {
		
		FileInputStream fi=new FileInputStream("./data/SHEET.XLSX");
		//Workbook wb=WorkbookFactory.c
		
		
		
		
		
		return null;
	}

}
