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
    public Map<String,String> getData(String fileName,String sheetName) throws FileNotFoundException, IOException {
        Map<String,String> map=new HashMap<>();
        FileInputStream inputStream=new FileInputStream(fileName);
        Workbook workbook=new XSSFWorkbook(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        int lastRowNumber = sheet.getLastRowNum();
        return map;
    }
}
