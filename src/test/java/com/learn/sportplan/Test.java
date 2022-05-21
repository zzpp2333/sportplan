package com.learn.sportplan;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
//import cn.afterturn.easypoi.util.PoiPublicUtil;
//import com.alibaba.excel.EasyExcel;
//import com.alibaba.excel.context.AnalysisContext;
//import com.alibaba.excel.event.AnalysisEventListener;
//import com.alibaba.excel.support.ExcelTypeEnum;
//import com.learn.sportplan.entity.Food1.java;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import com.learn.sportplan.entity.Food2;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Test {
//    public static<T> List<T> readExcel(InputStream file, Class<T> model){
////        因为jdk版本问题可能会报错Unable to make protected final java.lang.Class java.lang.ClassLoader.defineClass
////        所以vm options需要增加 --add-opens java.base/java.lang=ALL-UNNAMED
//        List<T> list = new ArrayList<>();
//        EasyExcel
//                // 读取文件
//                .read(file)
//                // 反射获取类型
//                .head(model)
//                // excel文件类型
//                .excelType(ExcelTypeEnum.XLSX)
//                // sheet
//                .sheet(0)
//                // 注册监听器
//                .registerReadListener(new AnalysisEventListener<T>() {
//                    @Override
//                    public void invoke(T t, AnalysisContext analysisContext){
//                        // 一行一行读取
//                        list.add(t);
//                    }
//                    @Override
//                    public void doAfterAllAnalysed(AnalysisContext analysisContext){
//                        System.out.println("读取完毕" + model);
//                    }
//                }).doRead();
//        return list;
//    }
    public static void main(String[] args) throws FileNotFoundException {
//        long start = System.currentTimeMillis();
//        List<Food1.java> foods = readExcel(new FileInputStream(new File("/Users/zwx/IdeaProjects/sportplan/excel/food.xlsx")), Food1.java.class);
//        long end = System.currentTimeMillis();
//        foods.forEach(System.out::println);
//        System.out.println("读取: " + foods.size() + "条");
//        System.out.println("easyexcel读取耗时: " + (end - start) / 1000 + "s");

        ImportParams params = new ImportParams();
//        params.setTitleRows(1);
//        params.setHeadRows(1);
        long start2 = System.currentTimeMillis();
        List<Food2> list = ExcelImportUtil.importExcel(
                new File("/Users/zwx/IdeaProjects/sportplan/excel/food.xlsx"),
                Food2.class, params);
        long end2 = System.currentTimeMillis();
        list.forEach(System.out::println);
        System.out.println("读取: " + list.size() + "条");
        System.out.println("easypoi读取耗时: " +  (end2 - start2)/100 + "s");
    }
}
