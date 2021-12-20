package com.Read;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Read {
public static void Read_particular_Data() throws IOException {
	File f = new File ("C:\\Users\\faayeza\\eclipse-workspace\\Maven.Archetype.quickstart\\JR.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fi);
    Sheet sheet = wb.getSheetAt(0);	
	Row row = sheet.getRow(2);
    Cell cell = row.getCell(0);
    CellType cellType = cell.getCellType();
    if (cellType.equals((CellType.STRING))) {
    String Value = cell.getStringCellValue();
    System.out.println(Value);
		
	}
    else if (cellType.equals((CellType.NUMERIC))) {
    	double cellValue = cell.getNumericCellValue();
    	int Value = (int) cellValue;
        System.out.println(Value);
    }}
public static void All_Data() throws IOException {
	File f = new File ("C:\\Users\\faayeza\\eclipse-workspace\\Maven.Archetype.quickstart\\JR.xlsx");
	FileInputStream fi = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fi);
    Sheet sheet = wb.getSheetAt(0);	
    int numberOfRows = sheet.getPhysicalNumberOfRows();
    for (int i = 0; i < numberOfRows; i++) {
    Row row = sheet.getRow(i);
    int physicalNumberOfCells = row.getPhysicalNumberOfCells();
    for (int j = 0; j < physicalNumberOfCells; j++) {	
    Cell cell = row.getCell(j);
    CellType cellType = cell.getCellType();
    if(cellType.equals(CellType.STRING)){
    String sCellValue = cell.getStringCellValue(); 	
    System.out.println(sCellValue);
    }
    else if (cellType.equals(cellType.NUMERIC)) {
    double NCellValue = cell.getNumericCellValue();
    int Value = (int) NCellValue;
    System.out.println(Value);
    }}}}
public static void main (String args[]) throws Throwable {
    
    	Read_particular_Data();
    	All_Data();

}}

    


