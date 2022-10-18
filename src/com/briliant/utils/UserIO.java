package com.briliant.utils;

import com.briliant.bean.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserIO {
    private static List<User> users = new ArrayList<>();
    private static final String USER_FILE = "user.obj";

    public boolean writeUsers() throws BusinessException{
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(USER_FILE));
            out.writeObject(users);
            out.close();
            return true;
        } catch (IOException e) {
            throw new BusinessException("io.write.error");
        }
    }

    public boolean readUsers() throws BusinessException {
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(USER_FILE));
            users = (List<User>) in.readObject();
            in.close();
        } catch (IOException | ClassNotFoundException e) {
            throw new BusinessException("io.read.error");
        }
        return true;
    }

    public void add(User user) {
        user.setUserId(user.getUserId() + 1);
        users.add(user);
    }

    public User findUsernameAndPassword(String username, String password) {
        for (User user :
                users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
