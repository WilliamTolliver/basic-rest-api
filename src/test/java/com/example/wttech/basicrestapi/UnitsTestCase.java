package com.example.wttech.basicrestapi;

import com.example.wttech.basicrestapi.service.ExcelFieldMapperService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UnitsTestCase {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should work")
    void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5),
                "Regular multiplication should work");
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    void testMultiplyWithZero() {
        assertEquals(0, calculator.multiply(0, 5), "Multiple with zero should be zero");
        assertEquals(0, calculator.multiply(5, 0), "Multiple with zero should be zero");
    }


    /*
        UNIT CLASS TESTS
     */

    @Test
    @DisplayName("UnitsList shouldnt be empty")
    void unitsListIsntNull(){
        ExcelFieldMapperService excelService = new ExcelFieldMapperService();

        //excelService.mapFieldsToUnit();
    }


}
