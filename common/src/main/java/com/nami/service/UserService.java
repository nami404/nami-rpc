package com.nami.service;

import com.nami.model.User;

/**
 * @author nami404
 * * @date 2024/6/25 16:21
 */
public interface UserService {
    /**
     * 获取用户
     *
     * @param user
     * @return
     */
    User getUser(User user);

    /**
     * 新方法，获得数字
     * @return
     */
    default short getNumber() {
        return 1;
    }
}
