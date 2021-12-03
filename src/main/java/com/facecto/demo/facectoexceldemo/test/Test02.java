package com.facecto.demo.facectoexceldemo.test;

import com.facecto.code.excel.ExcelWrite;
import com.facecto.code.excel.entity.ExcelData;
import com.facecto.demo.facectoexceldemo.data.TestData;
import com.facecto.demo.facectoexceldemo.entity.Head;
import com.facecto.demo.facectoexceldemo.entity.Order2;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jon So, https://cto.pub, https://github.com/facecto
 * @version v1.0.0 (2021/12/03)
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        ExcelWrite excelWrite = new ExcelWrite();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = "/home/test/demo-"+ formatter.format(LocalDateTime.now())+".xlsx";
        String templateFile = "/home/test/templates/order2.xlsx";
        ExcelData<Head, Order2> excelData = new ExcelData<>();
        TestData td = new TestData();
        excelData.setSheetHeadList(td.getHeadList());
        excelData.setSheetBodyList(td.getList());
        excelData.setSheetNameList(td.getNameList());
        excelWrite.writeWithTemplateMultiSheet(excelData,fileName,templateFile);
    }
}
