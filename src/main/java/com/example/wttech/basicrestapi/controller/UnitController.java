package com.example.wttech.basicrestapi.controller;

import com.example.wttech.basicrestapi.service.ExcelFieldMapperService;
import com.example.wttech.basicrestapi.model.Unit;
import com.example.wttech.basicrestapi.repo.UnitRepository;
import com.example.wttech.basicrestapi.service.UnitService;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Component
@RestController
public class UnitController {

    // Declarations

    @Autowired
    UnitRepository unitRepo;
    @Autowired
    ExcelFieldMapperService mapper;
    @Autowired
    UnitService unitService;

    @GetMapping("/units")
    public List<Unit> findAll() throws IOException {

        unitService.saveUnits();

        List<Unit> unitsList = new ArrayList<Unit>();
        for(Unit unit : unitRepo.findAll()){
            unitsList.add(unit);
        }

        return unitsList;
    }
}
