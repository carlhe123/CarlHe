package com.carl.util.excel;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Description Excel装Csv工具类
 * @Author carl.he
 * @Date 2019/8/1 11:19
 * @Version 1.0
 **/
public class ExcelToCsv {

    private ExcelReader excelReader;

    private CSVPrinter csvPrinter;

    public ExcelToCsv(ExcelReader excelReader) {
        this.excelReader = excelReader;
    }

    /**
     * @param fileName 相对于工程的路径 e.g.:/src/test/test.csv
     * @return
     * @Author carl.he
     * @Description 将数据写入CSV文件
     * @Date 2019/8/1 11:59
     **/
    public void convert(String fileName) throws Exception {
        if (!fileName.endsWith(".csv")) {
            throw new RuntimeException("文件类型不正确");
        }
        File file = new File("");//取当前项目路径
        if (!file.exists()) {
            file.mkdirs();//如不存在则创建，如有多级目录都会创建
        }
        //将新创建的CSV文件存在test目录下
        Appendable printWriter =
                new PrintWriter(file.getAbsolutePath() + fileName, "UTF-8");
        //写入第一行
        CSVPrinter csvPrinter = CSVFormat.EXCEL.withHeader("姓名", "性别", "年龄", "生日").print(printWriter);
        //插入数据
        for (int i = 0; i < 10; i++) {
            csvPrinter.printRecord("carl", "Man", 22, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        }
        //刷新缓存
        csvPrinter.flush();
        csvPrinter.close();
    }
}
