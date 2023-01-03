package excelutility;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

public class ExcelUtility {
    public Map<String,String> getData(String fileName,String sheetName) throws FileNotFoundException, IOException {
        FileInputStream inputStream=new FileInputStream(fileName);
        Workbook workbook=new XSSFWorkbook(inputStream);


    }
}
