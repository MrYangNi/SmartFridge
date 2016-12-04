package com.jayce.service.impl.user;

import com.jayce.pojo.user.SimpleUser;
import com.jayce.pojo.user.User;
import com.jayce.service.def.user.UserService;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Jaycejia on 2016/12/4.
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{

    @Override
    public SimpleUser getUser(String userId) throws UnknownAccountException {
        return null;
    }

    @Override
    public SimpleUser getUserByName(String username) throws UnknownAccountException {
        return null;
    }

    @Override
    public User getUserDetail(String userId) throws Exception {
        return null;
    }
}
