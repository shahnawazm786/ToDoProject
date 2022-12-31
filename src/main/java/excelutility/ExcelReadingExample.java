package excelutility;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelReadingExample {
    static File file=null;
    static FileInputStream inputStream=null;
    static XSSFWorkbook workbook=null;
    static XSSFSheet xssfSheet=null;
    Sheet sheet=null;
    static XSSFRow row=null;
    final String fileLocation="C:\\excel_file\\Orders.xlsx";
   static List<XSSFRow> rows=new ArrayList<>();
    public static void main(String[] args) {

    }

    public static XSSFSheet getSheet(String filePath,String sheetName) throws IOException {
        if(filePath.contains(".xlsx")){
         file=new File(filePath);
         inputStream=new FileInputStream(file);
         workbook=new XSSFWorkbook(inputStream);
         xssfSheet= workbook.getSheet(sheetName);
         return xssfSheet;
        }
        else{
            throw new IllegalStateException("File not found"+filePath);
        }

    }
public static List<XSSFRow> getRow(XSSFSheet sheetName){

        for(Row row : sheetName)
            rows.add((XSSFRow) row);
        return rows;
}


}
