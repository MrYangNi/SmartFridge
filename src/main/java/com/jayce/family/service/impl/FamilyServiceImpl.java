package com.jayce.family.service.impl;

import com.jayce.family.dao.FamilyMapper;
import com.jayce.family.dao.UserFamilyMapper;
import com.jayce.family.pojo.Family;
import com.jayce.family.service.def.FamilyService;
import com.jayce.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by Jayce on 2017/4/3.
 */
@Transactional
@Service
public class FamilyServiceImpl implements FamilyService {
    @Autowired
    private FamilyMapper familyMapper;
    @Autowired
    private UserFamilyMapper userFamilyMapper;

    @Override
    public List<Family> getFamiliesByUser(Long userId) {
        return userFamilyMapper.selectFamiliesByUser(userId);
    }

    @Override
    public List<User> getUsersByFamily(Long familyId) {
        return userFamilyMapper.selectUsersByFamily(familyId);
    }

    @Override
    public void addFamily(Family family) {
        family.setStatus(true);
        family.setCreateTime(new Date());
        familyMapper.insert(family);
        userFamilyMapper.insertUserFamilyRelation(family.getCreateUser(), family.getFamilyId());
    }

    @Override
    public void changeFamilyInfo(Family family) {
        familyMapper.updateByPrimaryKeySelective(family);
    }

    @Override
    public void removeFamily(Long familyId) {
        List<User> users = userFamilyMapper.selectUsersByFamily(familyId);
        for (User user : users) {
            userFamilyMapper.deleteUserFamilyRelation(user.getUserId(), familyId);
        }
        Family family = new Family();
        family.setFamilyId(familyId);
        family.setStatus(false);
        familyMapper.updateByPrimaryKeySelective(family);
    }

    @Override
    public void addUser2Family(Long userId, Long familyId) {
        if (userFamilyMapper.recoverUserFamilyRelation(userId, familyId) == 0) {
            userFamilyMapper.insertUserFamilyRelation(userId, familyId);
        }
    }

    @Override
    public void removeUserFamilyRelation(Long userId, Long familyId) {
        userFamilyMapper.deleteUserFamilyRelation(userId, familyId);
    }
}
