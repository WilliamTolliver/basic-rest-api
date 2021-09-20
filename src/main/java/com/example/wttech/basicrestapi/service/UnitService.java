package com.example.wttech.basicrestapi.service;

import com.example.wttech.basicrestapi.model.Unit;
import com.example.wttech.basicrestapi.repo.UnitRepository;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Service
public class UnitService {

    @Autowired
    UnitRepository unitRepository;
    @Autowired
    ExcelFieldMapperService mapperService;

    public void saveUnit(){

    }

    public void saveUnits() throws IOException {

        System.out.println(unitRepository);

        InputStream ExcelFileToRead = new FileInputStream("src\\main\\resources\\Dutch.xlsx");
        XSSFWorkbook wb = new XSSFWorkbook(ExcelFileToRead);

        // Test creation of a dummy workbook for runtime crash protection
        XSSFWorkbook test = new XSSFWorkbook();

        // Create a worksheet object to read from, out of the data pulled from the workbook. ( A sheet from a book)
        XSSFSheet sheet = wb.getSheetAt(0);

        List<Unit> unitsList = mapperService.mapFieldsToUnit(sheet, 3);

        try {
            for(Unit unit1 : unitsList)
                unitRepository.save(unit1);

        }catch (DataAccessException e){
            System.out.println("Failure Reason is : " + e.getStackTrace().toString());
        }
    }
}
