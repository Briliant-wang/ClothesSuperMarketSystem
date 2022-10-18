package com.briliant.view;

import com.briliant.bean.User;
import com.briliant.service.UserService;
import com.briliant.service.impl.UserServiceImpl;
import com.briliant.utils.BusinessException;

public class RegisterClass extends BaseClass {
    public void register() throws BusinessException {
        println(getString("input.username"));
        String username = input.nextLine();
        println(getString("input.password"));
        String password = input.nextLine();

        User user = new User(username, password);

        UserService userService = new UserServiceImpl();
        userService.register(user);
    }
}
