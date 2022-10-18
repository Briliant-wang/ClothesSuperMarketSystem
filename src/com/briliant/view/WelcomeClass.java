package com.briliant.view;

import com.briliant.utils.BusinessException;
import com.briliant.utils.UserIO;

public class WelcomeClass extends BaseClass {
    public void start() {
        print(getString("info.welcome"));
        boolean flag = true;
        UserIO userIO = new UserIO();
        userIO.readUsers();
        while (flag) {
            println(getString("info.login.reg"));
            println(getString("info.select"));
            String select = input.nextLine();
            switch (select) {
                case "1"://登录
                    try {
                        new LoginClass().login();
                        println(getString("login.success"));
                        flag = false;
                    } catch (BusinessException e) {
                        println(getString("login.error"));
                    }
                    break;
                case "2"://注册
                    try {
                        new RegisterClass().register();
                        println(getString("reg.success"));
                        flag = false;
                    } catch (BusinessException e) {
                        println(getString("reg.error"));
                    }
                    break;
                default:
                    println(getString("input.error"));
                    break;
            }
        }
    }
}
