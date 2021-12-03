package com.facecto.demo.facectoexceldemo.controller;

import com.facecto.code.excel.ExcelWrite;
import com.facecto.code.excel.entity.ExcelData;
import com.facecto.code.excel.strategy.MergeStrategy;
import com.facecto.demo.facectoexceldemo.data.TestData;
import com.facecto.demo.facectoexceldemo.entity.Head;
import com.facecto.demo.facectoexceldemo.entity.Order2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Jon So, https://cto.pub, https://github.com/facecto
 * @version v1.0.0 (2021/08/08)
 */
@RestController
public class TestController {
    TestData data = new TestData();

    @GetMapping("/01")
    public void test01(HttpServletResponse response) throws IOException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = formatter.format(LocalDateTime.now())+".xlsx";
        String templateFile = "templates/order1.xlsx";
        ExcelWrite excelWrite = new ExcelWrite();
        MergeStrategy mergeStrategy = new MergeStrategy(data.getRowMergeRole());
        excelWrite.writeWithTemplateByWeb(data.getHead(),data.getOrder(),mergeStrategy,null,fileName,templateFile,response);
    }

    @GetMapping("/02")
    public void test02(HttpServletResponse response) throws IOException {
        ExcelWrite excelWrite = new ExcelWrite();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String fileName = formatter.format(LocalDateTime.now())+".xlsx";
        String tempFineName="templates/order2.xlsx";
        ExcelData<Head, Order2> excelData = new ExcelData<>();
        excelData.setSheetHeadList(data.getHeadList());
        excelData.setSheetBodyList(data.getList());
        excelData.setSheetNameList(data.getNameList());
        excelWrite.writeWithTemplateMultiSheetByWeb(excelData,fileName,tempFineName,response);
    }
}
