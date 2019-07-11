package com.summer.service;

import com.summer.model.User;

/**
 * @author Administrator
 * @since 2019/7/11 10:08
 */
public interface UserService {

    int addUser(User user);

    boolean login(String username, String password);
}
