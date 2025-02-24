package com.crm.qa.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import com.opencsv.CSVReader;
//import com.opencsv.exceptions.CsvException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TestUtil {
		
		public static long PAGE_LOAD_TIMEOUT_=20;
		public static long IMPLICIT_WAIT=10;
}

//	    // Method to read data from CSV file
//	    public Object[][] getCSVData(String filePath) throws IOException, CsvException {
//	        CSVReader reader = new CSVReader(new FileReader(filePath));
//	        
//	        // Read all rows from CSV
//	        List<String[]> rows = reader.readAll();
//	        int rowsCount = rows.size();
//	        int colsCount = rows.get(0).length;
//	        
//	        Object[][] data = new Object[rowsCount - 1][colsCount]; // Excluding header
//	        
//	        // Start from row 1 to skip header
//	        for (int i = 1; i < rowsCount; i++) {
//	            String[] row = rows.get(i);
//	            for (int j = 0; j < colsCount; j++) {
//	                data[i - 1][j] = row[j]; // Assign data to array
//	            }
//	        }
//
//	        reader.close();
//	        return data; // Return the data in 2D array format
//	    }
//	}
//
//	

//	public static String ESTDATA_SHEET_PATH="/Users/shivanirajole/eclipse-workspace/frameworkpractice/src/main/java/com/crm/qa/testdata/FreeCRMData.numbers";
//	
//	static Workbook book;
//	static org.apache.poi.ss.usermodel.Sheet sheet;
//	
//	public static Object[][] getTestData(String sheetName){
//		FileInputStream file=null;
//		try {
//			file=new FileInputStream(ESTDATA_SHEET_PATH);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try {
//			book=WorkbookFactory.create(file);
//		} catch (EncryptedDocumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		sheet=book.getSheet(sheetName);
//		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
//		
//		for(int i=0; i<sheet.getLastRowNum();i++) {
//			for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
//				data[i][k] =sheet.getRow(i+1).getCell(k).toString();
//			}
//		}
//		return data;
//	}

