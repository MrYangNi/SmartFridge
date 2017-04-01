package com.jayce.tag.service.impl;

import com.jayce.tag.dao.TagMapper;
import com.jayce.tag.pojo.Tag;
import com.jayce.tag.service.def.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Jaycejia on 2017/4/1.
 */
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagMapper tagMapper;

    @Override
    public void addTag(Tag tag) {
        tagMapper.insert(tag);
    }
}
