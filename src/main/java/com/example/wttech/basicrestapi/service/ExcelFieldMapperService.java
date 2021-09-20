package com.example.wttech.basicrestapi.service;

import com.example.wttech.basicrestapi.model.Unit;
import com.example.wttech.basicrestapi.repo.UnitRepository;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class ExcelFieldMapperService {

    // Repository
    @Autowired
    UnitRepository unitRepository;

    /* Private */
    private static void mapFieldsToList(List<String> fieldValues, int count, XSSFSheet sheet) {

        Iterator rows = sheet.rowIterator();
        XSSFRow row;
        XSSFCell cell;
        if(count == 1) {
            rows.next();
            while (rows.hasNext() && count == 1)
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
        }


        //print values
        fieldValues.forEach(s -> System.out.println(s.toString()));
    }

    private static int mapHeaders(List<String> fieldNames, int count, XSSFSheet sheet) {

        Iterator rows = sheet.rowIterator();
        XSSFRow row;
        XSSFCell cell;
        while (rows.hasNext() && count== 0)
        {
            row=(XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext() && count == 0)
            {
                cell=(XSSFCell) cells.next();

                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING)
                {
                    fieldNames.add(cell.getStringCellValue());
                }

            }
            count++;
        }

        //print values
        fieldNames.forEach(s -> System.out.println(s.toString()));

        return count;
    }

    private static void printFields(List<String> fieldNames, List<String> fieldValuess) {
        for(int i = 0 ; i < fieldNames.size(); i++){
            System.out.print(fieldNames.get(i) + " ");
            System.out.println(fieldValuess.get(i) + ";");
        }
    }

    /* PUBLIC */

    public static void readXLSXFile() throws IOException
    {
        ExcelFieldMapperService mapper = new ExcelFieldMapperService();

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

        // Iterate over the rows. Print their value as a string.
        // TODO: Make this able to read the column headers so we can map values to Custom Object
        //count = mapHeaders(fieldNames, count, sheet);

        //mapHeaders(fieldNames, 0, sheet);
        //mapFieldsToList(fieldValues, 1, sheet);

        System.out.println(mapper.mapFieldsToUnit(sheet, 3));

    }

    public List<Unit> mapFieldsToUnit(XSSFSheet sheet, int count) {

        Unit unit;
        List<Unit> unitsList = new ArrayList<>();
        Iterator rows = sheet.rowIterator();
        XSSFRow row;
        XSSFCell cell;
        rows.next();
        rows.next();
        rows.next();

        System.out.println(unitRepository);

        while (rows.hasNext() && count >= 3) {

            List<String> values = new ArrayList<>();
            row = (XSSFRow) rows.next();
            Iterator cells = row.cellIterator();
            while (cells.hasNext()) {
                cell = (XSSFCell) cells.next();

                if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
                    values.add(cell.getStringCellValue());
                }
                if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
                    values.add(String.valueOf(cell.getNumericCellValue()));
                }
            }
            count++;

            if (!values.isEmpty()){
                unit = new Unit(
                        values.get(0),
                        values.get(1),
                        values.get(2),
                        Double.parseDouble(values.get(3)),
                        Double.parseDouble(values.get(4)),
                        Double.parseDouble(values.get(5)),
                        Double.parseDouble(values.get(6)),
                        Double.parseDouble(values.get(7)),
                        Double.parseDouble(values.get(8)),
                        Double.parseDouble(values.get(9)),
                        Double.parseDouble(values.get(10)),
                        Double.parseDouble(values.get(11)),
                        Double.parseDouble(values.get(12)),
                        Double.parseDouble(values.get(13)),
                        Double.parseDouble(values.get(14)),
                        Double.parseDouble(values.get(15)),
                        Double.parseDouble(values.get(16)),
                        Double.parseDouble(values.get(17)),
                        Double.parseDouble(values.get(18)),
                        Double.parseDouble(values.get(19)),
                        Double.parseDouble(values.get(20)),
                        Double.parseDouble(values.get(21)),
                        Double.parseDouble(values.get(22)),
                        Double.parseDouble(values.get(23)),
                        Double.parseDouble(values.get(24)),
                        Double.parseDouble(values.get(25)),
                        Double.parseDouble(values.get(26)),
                        Double.parseDouble(values.get(27)),
                        Double.parseDouble(values.get(28)),
                        values.get(29));

                unitsList.add(unit);
            }
        }

        return unitsList;
    }

    public String mappedFields(String fieldsList){

        return null;
    }

}
