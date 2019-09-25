package com.example.client.demo.esayjava;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * idea 中自动补全
 * @author :admin
 * @date : 2019/5/2322:10

 */

public class   IDEA_easyKey {


    private void test(String arg) {

        //var 声明
        // "name" .var
        String name = "name";
        List<String> list = new ArrayList<String>();

        //nn 遍历
        //list.nn
        for (String s : list) {

        }

        //fori 带索引正序遍历
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }

        //forr 带索引倒叙遍历
        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //nn判非空
        //list.nn
        if (list != null) {
            //null 判空
            //list.null
            if (list == null) {
                //notnull 判非空
               // list.notnull
                if (list != null) {

                }
            }
        }

        //not 取反
        boolean flag = true ;
        //flag.not = > !flag

        //if 条件判断
        //list.size()>0.if
        if (list.size() > 0) {

        }

        Object obj = "name" ;
        //cast 强转
        // obj => cast (() obj)

    }


    public  String get(){
//return f返回值
    //"String".return
        return "String";
    }
}
