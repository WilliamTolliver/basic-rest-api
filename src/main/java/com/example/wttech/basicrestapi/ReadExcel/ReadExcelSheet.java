package com.example.wttech.basicrestapi.ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

@Component
public class ReadExcelSheet {

    public static void readXLSXFile() throws IOException
    {

        /*
        * Create A new file input stream from your Excel sheet file.
        * Feed that into a Workbook wrapper Object.
        * */
        InputStream ExcelFileToRead = new FileInputStream("src\\main\\resources\\Dutch.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);

        // Test creation of a dummy workbook for runtime crash protection
        XSSFWorkbook test = new XSSFWorkbook();

        // Create a worksheet object to read from, out of the data pulled from the workbook. ( A sheet from a book)
        XSSFSheet sheet = wb.getSheetAt(0);
        XSSFRow row;
        XSSFCell cell;

        Iterator rows = sheet.rowIterator();

        // Iterate over the rows. Print their value as a string.
        while (rows.hasNext())
        {
            row=(XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext())
            {
                cell=(XSSFCell) cells.next();

                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
                {
                    System.out.print(cell.getStringCellValue()+" ");
                }
                else if(cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC)
                {
                    System.out.print(cell.getNumericCellValue()+" ");
                }
                else
                {
                    //U Can Handel Boolean, Formula, Errors
                }
            }
        }

    }

    public static void main(String[] args) {
        try {
            ReadExcelSheet.readXLSXFile();
        } catch (IOException e) {
            System.out.println("Not saved");;
        }

    }

}
