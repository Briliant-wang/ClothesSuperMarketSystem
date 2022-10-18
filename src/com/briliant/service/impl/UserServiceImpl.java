package com.briliant.service.impl;

import com.briliant.bean.User;
import com.briliant.service.UserService;
import com.briliant.utils.BusinessException;
import com.briliant.utils.EmptyUtils;
import com.briliant.utils.UserIO;

public class UserServiceImpl implements UserService {
    @Override
    public User register(User user) throws BusinessException {
        UserIO userIO = new UserIO();
        userIO.add(user);
        userIO.writeUsers();
        return user;
    }

    @Override
    public User login(String username,String password) throws BusinessException {
        if (EmptyUtils.isEmpty(username)) {
            throw new BusinessException("username.notnull");
        }
        if (EmptyUtils.isEmpty(password)) {
            throw new BusinessException("password.notnull");
        }

        UserIO userIO = new UserIO();
        User user = userIO.findUsernameAndPassword(username, password);
        return user;
    }
}
