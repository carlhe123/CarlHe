package com.carl.util.excel;

import org.junit.Test;

/**
 * @Description TODO Carl写点注释吧！
 * @Author carl.he
 * @Date 2019/8/1 11:30
 * @Version 1.0
 **/
public class ExcelToCsvTest {

    @Test
    public void testExcelToCev(){
        try {
            ExcelToCsv excelToCsv = new ExcelToCsv();
            excelToCsv.write();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
