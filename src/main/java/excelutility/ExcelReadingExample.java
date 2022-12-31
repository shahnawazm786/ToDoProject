package excelutility;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReadingExample {
    static File file=null;
    static FileInputStream inputStream=null;
    static XSSFWorkbook workbook=null;
    static XSSFSheet xssfSheet=null;
    Sheet sheet=null;
    final String fileLocation="C:\\excel_file\\Orders.xlsx";
    public static void main(String[] args) {

    }

    public static void getSheet(String filePath,String sheetName) throws IOException {
        if(filePath.contains(".xlsx")){
         file=new File(filePath);
         inputStream=new FileInputStream(file);
         workbook=new XSSFWorkbook(inputStream);
         
        }
    }


}
