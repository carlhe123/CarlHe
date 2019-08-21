package com.carl.util.excel;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedHashMap;

/**
 * @Description Excel读取工具类
 * @Author carl.he
 * @Date 2019/7/12 10:29
 * @Version 1.0
 **/
public class ExcelReader {

    /** 定义 Excel文件的类型*/
    public static enum Type{
        XLS,XLSX
    }

    /** 对应excel文件 */
    private Workbook excel;
    /** 单个sheet页*/
    private Sheet sheet;
    /** excel第一行的内容*/
    private LinkedHashMap<String, Integer> header;

    /**
     * @Author carl.he
     * @Description 根据传入的type处理对应类型的文件 默认处理第一个sheet页的内容
     * @Date 2019/8/1 15:46
     * @param inputStream 文件输入流
     * @param type 	{@link Type}文件类型
     * @return {@link }
     **/
    public ExcelReader(InputStream inputStream,Type type) throws IOException {
        switch(type){
            case XLS:
                excel = new HSSFWorkbook(inputStream);break;
            default:
                excel = new XSSFWorkbook(inputStream);
        }
        sheet = excel.getSheetAt(0);//默认取excel的第一个sheet页
        header = new LinkedHashMap<>();//保存header行
    }

    /**
     * @Author carl.he
     * @Description 根据传入的type处理对应类型的文件 处理对应名称sheet页的内容
     * @Date 2019/8/1 15:48
     * @param inputStream 文件输入流
     * @param sheetName	sheet页名称
     * @param type	{@link Type}
     * @return {@link }
     **/
    public ExcelReader(InputStream inputStream,String sheetName,Type type) throws IOException {
        switch(type){
            case XLS:
                excel = new HSSFWorkbook(inputStream);break;
            default:
                excel = new XSSFWorkbook(inputStream);
        }
        sheet = excel.getSheet(sheetName);//根据sheetName得到对应的sheet页
        header = new LinkedHashMap<>();//保存header行
    }
    /**
     * @Author carl.he
     * @Description 默认处理.xls结尾的文件  默认处理第一个sheet页
     * @Date 2019/8/1 15:44
     * @param inputStream
     * @return {@link }
     **/
    public ExcelReader(InputStream inputStream) throws IOException {
        excel = new XSSFWorkbook(inputStream);
        sheet = excel.getSheetAt(0);
        header = new LinkedHashMap<String, Integer>();
    }
    /**
     * @Author carl.he
     * @Description 处理对应名称的sheet页 文件类型默认为.xls结尾
     * @Date 2019/8/1 15:45
     * @param inputStream
     * @param sheetName	sheet页名称
     * @return {@link }
     **/
    public ExcelReader(InputStream inputStream, String sheetName) throws IOException {
        excel = new XSSFWorkbook(inputStream);
        sheet = excel.getSheet(sheetName);
        header = new LinkedHashMap<String, Integer>();
    }

    public boolean getHeader(int line){
        return readLine(0);
    }

    public boolean readLine(int line){

        return true;
    }
}
