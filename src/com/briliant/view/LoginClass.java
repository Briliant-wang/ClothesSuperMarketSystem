package com.briliant.view;

import com.briliant.bean.User;
import com.briliant.service.impl.UserServiceImpl;
import com.briliant.utils.BusinessException;

public class LoginClass extends BaseClass {
    public void login() throws BusinessException {
        println(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();

        UserServiceImpl userService = new UserServiceImpl();
        User user = userService.login(username, password);
        if (user != null) {
            currUser = user;
        } else {
            throw new BusinessException("login.error");
        }
    }
}
