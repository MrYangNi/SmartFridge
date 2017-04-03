package com.jayce.family.controller;

import com.jayce.family.pojo.Family;
import com.jayce.family.service.def.FamilyService;
import com.jayce.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Jayce on 2017/4/3.
 */
@RestController
public class FamilyController {
    @Autowired
    private FamilyService familyService;

    @RequestMapping(value = "/family", method = RequestMethod.GET)
    public List<Family> getFamiliesByUser(Long userId) {
        return familyService.getFamiliesByUser(userId);
    }

    @RequestMapping(value = "/family/user/{familyId}", method = RequestMethod.GET)
    public List<User> getUsersByFamily(@PathVariable Long familyId) {
        return familyService.getUsersByFamily(familyId);
    }

    @RequestMapping(value = "/family", method = RequestMethod.POST)
    public String addFamily(@RequestBody Family family) {
        familyService.addFamily(family);
        return "添加家庭" + family.getFamilyName() + "成功";
    }

    @RequestMapping(value = "/family", method = RequestMethod.PUT)
    public String changeFamily(@RequestBody Family family) {
        familyService.changeFamilyInfo(family);
        return "修改家庭信息成功";
    }

    @RequestMapping(value = "/family/{familyId}", method = RequestMethod.DELETE)
    public String removeFamily(@PathVariable Long familyId) {
        familyService.removeFamily(familyId);
        return "删除家庭成功";
    }

    @RequestMapping(value = "/family/{familyId}/user", method = RequestMethod.POST)
    public String addUser2Family(@RequestBody Long userId, @PathVariable("familyId") Long familyId) {
        familyService.addUser2Family(userId, familyId);
        return "家庭成员添加成功";
    }

    @RequestMapping(value = "/family/{familyId}/user", method = RequestMethod.DELETE)
    public String removeUser2Family(Long userId, @PathVariable("familyId") Long familyId) {
        familyService.removeUserFamilyRelation(userId, familyId);
        return "家庭成员移除成功";
    }
}
