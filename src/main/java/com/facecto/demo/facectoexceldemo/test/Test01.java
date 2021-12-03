package com.facecto.demo.facectoexceldemo.test;

import com.facecto.code.excel.ExcelWrite;
import com.facecto.code.excel.strategy.MergeStrategy;
import com.facecto.demo.facectoexceldemo.data.TestData;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jon So, https://cto.pub, https://github.com/facecto
 * @version v1.0.0 (2021/12/03)
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = "/home/test/demo-"+ formatter.format(LocalDateTime.now())+".xlsx";
        String templateFile = "/home/test/templates/order1.xlsx";
        ExcelWrite excelWrite = new ExcelWrite();
        TestData td = new TestData();
        MergeStrategy mergeStrategy = new MergeStrategy(td.getRowMergeRole());
        excelWrite.writeWithTemplate(td.getHead(),td.getOrder(),mergeStrategy,null,fileName,templateFile);
    }
}
