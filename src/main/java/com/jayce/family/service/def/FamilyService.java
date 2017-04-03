package com.jayce.family.service.def;

import com.jayce.family.pojo.Family;
import com.jayce.user.pojo.User;

import java.util.List;

/**
 * Created by Jayce on 2017/4/3.
 */
public interface FamilyService {
    List<Family> getFamiliesByUser(Long userId);

    List<User> getUsersByFamily(Long familyId);

    void addFamily(Family family);

    void changeFamilyInfo(Family family);

    void removeFamily(Long familyId);

    void addUser2Family(Long userId, Long familyId);

    void removeUserFamilyRelation(Long userId, Long familyId);
}
