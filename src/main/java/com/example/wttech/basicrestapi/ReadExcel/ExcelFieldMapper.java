package com.example.wttech.basicrestapi.ReadExcel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class ExcelFieldMapper {

    public String mappedFields(String fieldsList){

        return null;
    }

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
        List<String> fieldNames = new ArrayList<>();
        List<String> fieldValues = new ArrayList<>();
        int count = 0;

        Iterator rows = sheet.rowIterator();

        // Iterate over the rows. Print their value as a string.
        // TODO: Make this able to read the column headers so we can map values to Custom Object
        while (rows.hasNext() && count== 0)
        {
            row=(XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext())
            {
                cell=(XSSFCell) cells.next();

                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
                {
                    fieldNames.add(cell.getStringCellValue());
                }

            }
            count++;
        }

        while (rows.hasNext() && count== 1)
        {
            row=(XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext())
            {
                cell=(XSSFCell) cells.next();

                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
                {
                    fieldValues.add(cell.getStringCellValue());
                }

            }
            count++;
        }

        for(int i = 0 ; i < fieldNames.size(); i++){
            System.out.print(fieldNames.get(i) + " ");
            System.out.println(fieldValues.get(i) + ";");
        }

    }

    public static void main(String[] args) {
        try {
            ExcelFieldMapper.readXLSXFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
