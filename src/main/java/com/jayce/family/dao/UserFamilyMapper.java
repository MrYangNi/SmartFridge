package com.jayce.family.dao;

import com.jayce.family.pojo.Family;
import com.jayce.user.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Jayce on 2017/4/3.
 */
public interface UserFamilyMapper {
    List<Family> selectFamiliesByUser(Long userId);

    List<User> selectUsersByFamily(Long familyId);

    int insertUserFamilyRelation(@Param("userId") Long userId, @Param("familyId") Long familyId);

    int recoverUserFamilyRelation(@Param("userId") Long userId, @Param("familyId") Long familyId);

    int deleteUserFamilyRelation(@Param("userId") Long userId, @Param("familyId") Long familyId);
}
