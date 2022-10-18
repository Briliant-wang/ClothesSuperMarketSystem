package com.briliant.service;

import com.briliant.bean.User;
import com.briliant.utils.BusinessException;

import java.util.prefs.BackingStoreException;

public interface UserService {
    public User register(User user) throws BusinessException;

    public User login(String username,String password) throws BusinessException;
}
