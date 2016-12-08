package com.jayce.service.impl.user;

import com.jayce.dao.user.SimpleUserMapper;
import com.jayce.dao.user.UserMapper;
import com.jayce.pojo.user.SimpleUser;
import com.jayce.pojo.user.SimpleUserExample;
import com.jayce.pojo.user.User;
import com.jayce.service.def.user.UserService;
import org.apache.shiro.authc.UnknownAccountException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Jaycejia on 2016/12/4.
 */
@Transactional
@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private SimpleUserMapper simpleUserMapper;
    @Autowired
    private UserMapper userMapper;
    @Override
    public SimpleUser getUser(Long userId) throws UnknownAccountException {
        SimpleUser simpleUser = simpleUserMapper.selectByPrimaryKey(userId);
        if (simpleUser == null) {
            throw new UnknownAccountException();
        }
        return simpleUser;
    }

    @Override
    public SimpleUser getUserByName(String username) throws UnknownAccountException {
        SimpleUserExample example = new SimpleUserExample();
        SimpleUserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        criteria.andStatusEqualTo(true);
        List<SimpleUser> simpleUsers = simpleUserMapper.selectByExample(example);
        if (simpleUsers == null || simpleUsers.size() == 0) {//若找不到用户则无此用户
            throw new UnknownAccountException();
        } else {
            return simpleUsers.get(0);
        }
    }

    @Override
    public User getUserDetail(Long userId) throws UnknownAccountException {
        User user = userMapper.selectByPrimaryKey(userId);
        if (user == null) {
            throw new UnknownAccountException();
        }
        return user;
    }
}
