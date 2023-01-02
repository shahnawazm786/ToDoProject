package excelutility;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelExample {
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;
    static FileInputStream inputStream;
    static final String filePath="C:\\excel_file\\my_excel_file.xlsx";

    public static void main(String[] args) throws IOException {
        readExcelUsingLoop();
    }

    public static void  readExcelUsingLoop() throws IOException{
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
                //System.out.print(sheet.getRow(r).getCell(c).getStringCellValue());
                switch (sheet.getRow(r).getCell(c).getCellType()){
                    case STRING:
                    case BLANK:
                        System.out.print(sheet.getRow(r).getCell(c).getStringCellValue());
                        break;
                    case NUMERIC:
                        System.out.print(sheet.getRow(r).getCell(c).getNumericCellValue());
                        break;
                    case BOOLEAN:
                        System.out.print(sheet.getRow(r).getCell(c).getBooleanCellValue());
                        break;
                    case _NONE:
                    case ERROR:
                        break;
                    case FORMULA:
                        System.out.print(sheet.getRow(r).getCell(c).getCellFormula());
                        break;

                }
                System.out.print("  |  ");
            }
            System.out.println();
        }




    }
}
