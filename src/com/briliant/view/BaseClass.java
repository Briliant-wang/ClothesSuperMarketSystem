package com.briliant.view;

import com.briliant.bean.User;

import java.util.ResourceBundle;
import java.util.Scanner;

public abstract class BaseClass {
    protected static User currUser; //当前用户信息
    protected static Scanner input = new Scanner(System.in);
    private static ResourceBundle r =
            ResourceBundle.getBundle("com.briliant.res.r");


    public static String getString(String key) {
        return r.getString(key);
    }

    public static void println(String s) {
        System.out.println(s);
    }
    public static void print(String s) {
        System.out.println(s);
    }
}
