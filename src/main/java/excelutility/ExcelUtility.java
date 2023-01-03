package excelutility;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtility {
    public static Map<String,String> getData(String fileName,String sheetName) throws FileNotFoundException, IOException {
        Map<String,String> map=new HashMap<>();
        FileInputStream inputStream=new FileInputStream(fileName);
        Workbook workbook=new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        int lastRowNumber = sheet.getLastRowNum();
        for(int row=0; row<lastRowNumber;row++){
            String key=sheet.getRow(row).getCell(0).getStringCellValue();
            String value=sheet.getRow(row).getCell(1).getStringCellValue();
            map.put(key,value);
        }
        return map;
    }
    public static Map<String,String> getData(String fileName,String sheetName,int keyColum,int valueColumn) throws FileNotFoundException, IOException {
        Map<String,String> map=new HashMap<>();
        FileInputStream inputStream=new FileInputStream(fileName);
        Workbook workbook=new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        int lastRowNumber = sheet.getLastRowNum();
        for(int row=0; row<lastRowNumber;row++){
            String key=sheet.getRow(row).getCell(0).getStringCellValue();
            String value=sheet.getRow(row).getCell(1).getStringCellValue();
            map.put(key,value);
        }
        return map;
    }
}
