package excelutility;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelExample {
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    FileInputStream inputStream;
    final String filePath="C:\\excel_file\\orders.xlsx";
    @Test
    public void readExcelUsingLoop() throws IOException{
        inputStream=new FileInputStream(filePath);
        workbook=new XSSFWorkbook(inputStream);
        if(workbook!=null){
            sheet=workbook.getSheetAt(0);
        }else
        {
            throw new FileNotFoundException("File not found ->"+filePath);
        }
        int row = sheet.getLastRowNum();
        for(int r=0; r<row;r++){
            int cell = sheet.getRow(r).getLastCellNum();
            for(int c=0;c<cell;c++){
                System.out.print(sheet.getRow(r).getCell(c).getStringCellValue());
            }
            System.out.println();
        }




    }
}
