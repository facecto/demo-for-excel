package com.facecto.demo.facectoexceldemo.data;

import com.facecto.code.excel.entity.SheetBody;
import com.facecto.code.excel.strategy.RowMergeColumnRole;
import com.facecto.code.excel.strategy.RowMergeRole;
import com.facecto.demo.facectoexceldemo.entity.Head;
import com.facecto.demo.facectoexceldemo.entity.Order1;
import com.facecto.demo.facectoexceldemo.entity.Order2;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

/**
 * @author Jon So, https://cto.pub, https://github.com/facecto
 * @version v1.0.0 (2021/12/03)
 */
public class TestData {
    public RowMergeRole getRowMergeRole(){
        RowMergeColumnRole columnRole1 = new RowMergeColumnRole()
                .setColumnStart(0)
                .setColumnEnd(0)
                .setRowMerges(Arrays.asList(2,3,2,1,2));
        RowMergeColumnRole columnRole2 = new RowMergeColumnRole()
                .setColumnStart(1)
                .setColumnEnd(1)
                .setRowMerges(Arrays.asList(2,3,2,1,2));
        RowMergeColumnRole columnRole3 = new RowMergeColumnRole()
                .setColumnStart(2)
                .setColumnEnd(2)
                .setRowMerges(Arrays.asList(2,3,2,1,2));
        RowMergeColumnRole columnRole4 = new RowMergeColumnRole()
                .setColumnStart(3)
                .setColumnEnd(3)
                .setRowMerges(Arrays.asList(2,3,2,1,2));

        RowMergeRole rowMergeRole = new RowMergeRole()
                .setRowNum(10)
                .setRowSkip(3)
                .setList(Arrays.asList(columnRole1,columnRole2,columnRole3,columnRole4));
        return rowMergeRole;
    }

    public Map<String,Object> getHead(){
        Map<String, Object> map = new HashMap<>();
        map.put("store", "门前店");
        map.put("tel", "13912300000");
        map.put("man", "冯库");
        map.put("date", "2021-11-10");
        return map;
    }

    public List<Order1> getOrder(){
        Order1 order1 = new Order1()
                .setOrderNo("2021-01-0001")
                .setOrderDate(LocalDate.now().toString())
                .setOrderMoney(BigDecimal.valueOf(200))
                .setGoodTitle("水笔")
                .setGoodPrice(BigDecimal.valueOf(20))
                .setGoodNum(10)
                .setCustTel("13912345678")
                .setCustName("李三三")
                .setOrderType("办公用品");
        Order1 order12 = new Order1();
        BeanUtils.copyProperties(order1, order12);
        order12.setOrderNo("2021-01-0001").setGoodTitle("A4纸").setGoodPrice(BigDecimal.valueOf(23.9)).setGoodNum(10).setOrderMoney(BigDecimal.valueOf(239));

        Order1 order13 = new Order1();
        BeanUtils.copyProperties(order1, order13);
        order13.setOrderNo("2021-01-0002").setGoodTitle("记事本").setGoodPrice(BigDecimal.valueOf(4.6)).setGoodNum(100).setOrderMoney(BigDecimal.valueOf(460));

        Order1 order14 = new Order1();
        BeanUtils.copyProperties(order1, order14);
        order14.setOrderNo("2021-01-0002").setGoodTitle("打印机").setGoodPrice(BigDecimal.valueOf(2895)).setGoodNum(2).setOrderMoney(BigDecimal.valueOf(5790))
                .setCustName("陈国国").setCustTel("13678912345").setOrderType("办公耗材");

        Order1 order15 = new Order1();
        BeanUtils.copyProperties(order14, order15);
        order15.setOrderNo("2021-01-0002").setGoodTitle("投影仪").setGoodPrice(BigDecimal.valueOf(7999)).setGoodNum(1).setOrderMoney(BigDecimal.valueOf(7999));

        //3
        Order1 order16 = new Order1();
        BeanUtils.copyProperties(order1, order16);
        order16.setOrderNo("2021-02-0003").setGoodTitle("早餐奶").setGoodPrice(BigDecimal.valueOf(49.95)).setGoodNum(10).setOrderMoney(BigDecimal.valueOf(499.5))
                .setCustName("孙二娘").setCustTel("13012654795").setOrderType("餐饮");

        Order1 order17 = new Order1();
        BeanUtils.copyProperties(order16, order17);
        order17.setOrderNo("2021-02-0003").setGoodTitle("燕麦面包").setGoodPrice(BigDecimal.valueOf(15.00)).setGoodNum(100).setOrderMoney(BigDecimal.valueOf(1500));

        Order1 order18 = new Order1();
        BeanUtils.copyProperties(order16, order18);
        order18.setOrderNo("2021-02-0004").setGoodTitle("可乐").setGoodPrice(BigDecimal.valueOf(5.00)).setGoodNum(100).setOrderMoney(BigDecimal.valueOf(500));


        //2
        Order1 order19 = new Order1();
        BeanUtils.copyProperties(order1, order19);
        order19.setOrderNo("2021-04-0005").setGoodTitle("椅子").setGoodPrice(BigDecimal.valueOf(1399)).setGoodNum(10).setOrderMoney(BigDecimal.valueOf(13990))
                .setCustName("周熊").setCustTel("13945000003").setOrderType("娱乐设施");

        Order1 order110 = new Order1();
        BeanUtils.copyProperties(order19, order110);
        order110.setOrderNo("2021-04-0005").setGoodTitle("Wii").setGoodPrice(BigDecimal.valueOf(5399)).setGoodNum(1).setOrderMoney(BigDecimal.valueOf(5399))
        ;

        return Arrays.asList(order1, order12, order13, order14, order15, order16, order17, order18, order19, order110);
    }

    public List<Head> getHeadList(){
        List<Head> listHead = new ArrayList<>();
        Head head1 = new Head()
                .setStoreId(1)
                .setStoreTitle("福州天山店")
                .setStoreCode("FZ-A-001")
                .setBillMaker("李文浩")
                .setBillDate("2022-03-12")
                .setAuditor("罗美玲")
                .setAllNum(40)
                .setEndDate("2022-03-11")
                .setContactTel("5910-123-456")
                .setContactName("陈辉阳")
                .setContactAddr("福州市天山区思明路32号-02#")
                .setBeginDate("2022-03-07")
                .setAllMoney(BigDecimal.valueOf(210));

        Head head2 = new Head()
                .setStoreId(1)
                .setStoreTitle("福州朝阳店")
                .setStoreCode("FZ-B-009")
                .setBillMaker("李文浩")
                .setBillDate("2022-03-12")
                .setAuditor("罗美玲")
                .setAllNum(50)
                .setEndDate("2022-03-11")
                .setContactTel("5910-123-779")
                .setContactName("林晓东")
                .setContactAddr("福州市朝阳区前与路99号二层")
                .setBeginDate("2022-03-07")
                .setAllMoney(BigDecimal.valueOf(545));

        Head head3 = new Head()
                .setStoreId(1)
                .setStoreTitle("福州中山店")
                .setStoreCode("FZ-C-033")
                .setBillMaker("李文浩")
                .setBillDate("2022-03-12")
                .setAuditor("罗美玲")
                .setAllNum(50)
                .setEndDate("2022-03-11")
                .setContactTel("5910-123-554")
                .setContactName("林雯雯")
                .setContactAddr("福州市中山区犀牛路19号东")
                .setBeginDate("2022-03-07")
                .setAllMoney(BigDecimal.valueOf(293));
        listHead.add(head1);
        listHead.add(head2);
        listHead.add(head3);
        return listHead;
    }

    public List<String> getNameList(){
        List<String> listName = new ArrayList<>();
        listName.add("福州天山店");
        listName.add("福州朝阳店");
        listName.add("福州中山店");
        return listName;
    }

    public List<SheetBody<Order2>> getList(){
        List<SheetBody<Order2>> list = new ArrayList<>();

        SheetBody<Order2> SheetBody1 = new SheetBody<>();
        SheetBody<Order2> SheetBody2 = new SheetBody<>();
        SheetBody<Order2> SheetBody3 = new SheetBody<>();
        SheetBody1.setList(getVoList());
        SheetBody2.setList(getVoList2());
        SheetBody3.setList(getVoList3());
        list.add(SheetBody1);
        list.add(SheetBody2);
        list.add(SheetBody3);

        return list;
    }

    private List<Order2> getVoList2(){
        List<Order2> list = new ArrayList<>();
        Order2 vo1 = new Order2()
                .setOrderDate("2022-03-07")
                .setGoodTitle("爱思巧克力面包")
                .setGoodPrice(BigDecimal.valueOf(8.5))
                .setGoodNum(10)
                .setOrderNo("FZ20220307-B009-123001")
                .setOrderMoney(BigDecimal.valueOf(85))
                .setCustName("赵一栋");
        Order2 vo2 = new Order2();
        Order2 vo3 = new Order2();
        Order2 vo4 = new Order2();
        Order2 vo5 = new Order2();
        BeanUtils.copyProperties(vo1,vo2);
        BeanUtils.copyProperties(vo1,vo3);
        BeanUtils.copyProperties(vo1,vo4);
        BeanUtils.copyProperties(vo1,vo5);
        vo2.setCustName("刘泰毅").setOrderNo("FZ20220308-B009-101007").setOrderDate("2022-03-08").setGoodPrice(BigDecimal.valueOf(12)).setGoodTitle("拿铁咖啡").setOrderMoney(BigDecimal.valueOf(120));
        vo3.setCustName("刘泰毅").setOrderNo("FZ20220308-B009-101007").setOrderDate("2022-03-08").setGoodPrice(BigDecimal.valueOf(5)).setGoodTitle("春茶豆沙面包").setOrderMoney(BigDecimal.valueOf(50));
        vo4.setCustName("秦一天").setOrderNo("FZ20220310-B009-155010").setOrderDate("2022-03-10").setGoodPrice(BigDecimal.valueOf(9)).setGoodTitle("梅菜土豆卷").setOrderMoney(BigDecimal.valueOf(90));
        vo5.setCustName("单华力").setOrderNo("FZ20220311-B009-155011").setOrderDate("2022-03-11").setGoodPrice(BigDecimal.valueOf(20)).setGoodTitle("火腿西洋参热饮").setOrderMoney(BigDecimal.valueOf(200));
        list.add(vo1);
        list.add(vo2);
        list.add(vo3);
        list.add(vo4);
        list.add(vo5);
        return list;
    }
    private List<Order2> getVoList(){
        List<Order2> list = new ArrayList<>();
        Order2 vo1 = new Order2()
                .setOrderDate("2022-03-09")
                .setGoodTitle("西瓜拿铁热饮")
                .setGoodPrice(BigDecimal.valueOf(9))
                .setGoodNum(10)
                .setOrderNo("FZ20220309-A001-123005")
                .setOrderMoney(BigDecimal.valueOf(90))
                .setCustName("陈以彬");
        Order2 vo2 = new Order2();
        Order2 vo3 = new Order2();
        Order2 vo4 = new Order2();
        BeanUtils.copyProperties(vo1,vo2);
        BeanUtils.copyProperties(vo1,vo3);
        BeanUtils.copyProperties(vo1,vo4);
        vo2.setCustName("陈以彬").setOrderNo("FZ20220309-A001-123005").setOrderDate("2022-03-09").setGoodPrice(BigDecimal.valueOf(5)).setGoodTitle("春茶豆沙面包").setOrderMoney(BigDecimal.valueOf(50));
        vo3.setCustName("温德宾").setOrderNo("FZ20220310-A001-101544").setOrderDate("2022-03-10").setGoodPrice(BigDecimal.valueOf(4)).setGoodTitle("火腿西洋参热饮").setOrderMoney(BigDecimal.valueOf(40));
        vo4.setCustName("温德宾").setOrderNo("FZ20220310-A001-101544").setOrderDate("2022-03-10").setGoodPrice(BigDecimal.valueOf(3)).setGoodTitle("梅菜土豆卷").setOrderMoney(BigDecimal.valueOf(30));
        list.add(vo1);
        list.add(vo2);
        list.add(vo3);
        list.add(vo4);
        return list;
    }

    private List<Order2> getVoList3(){
        List<Order2> list = new ArrayList<>();
        Order2 vo1 = new Order2()
                .setOrderDate("2022-03-08")
                .setGoodTitle("热草莓奶昔苹果味")
                .setGoodPrice(BigDecimal.valueOf(8))
                .setGoodNum(10)
                .setOrderNo("FZ20220308-C033-132011")
                .setOrderMoney(BigDecimal.valueOf(80))
                .setCustName("蒋点点");
        Order2 vo2 = new Order2();
        Order2 vo3 = new Order2();
        Order2 vo4 = new Order2();
        Order2 vo5 = new Order2();
        BeanUtils.copyProperties(vo1,vo2);
        BeanUtils.copyProperties(vo1,vo3);
        BeanUtils.copyProperties(vo1,vo4);
        BeanUtils.copyProperties(vo1,vo5);
        vo2.setCustName("蒋点点").setOrderNo("FZ20220308-C033-132011").setOrderDate("2022-03-08").setGoodTitle("梅菜土豆卷").setGoodPrice(BigDecimal.valueOf(10)).setOrderMoney(BigDecimal.valueOf(100));
        vo3.setCustName("柳春三").setOrderNo("FZ20220310-C033-145051").setOrderDate("2022-03-10").setGoodTitle("春茶豆沙面包").setGoodPrice(BigDecimal.valueOf(5)).setOrderMoney(BigDecimal.valueOf(50));
        vo4.setCustName("候天乔").setOrderNo("FZ20220310-C033-199025").setOrderDate("2022-03-10").setGoodTitle("榨菜萝卜饼").setGoodPrice(BigDecimal.valueOf(3.5)).setOrderMoney(BigDecimal.valueOf(35));
        vo5.setCustName("杜山山").setOrderNo("FZ20220311-C033-103005").setOrderDate("2022-03-11").setGoodTitle("西瓜番茄堡").setGoodPrice(BigDecimal.valueOf(2.8)).setOrderMoney(BigDecimal.valueOf(28));
        list.add(vo1);
        list.add(vo2);
        list.add(vo3);
        list.add(vo4);
        list.add(vo5);
        return list;
    }

}
