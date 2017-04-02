package com.jayce.tag.controller;

import com.jayce.tag.service.def.TagService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Jaycejia on 2017/4/1.
 */
@RestController
public class TagController {
    private static final Logger logger = LoggerFactory.getLogger(TagController.class);
    @Autowired
    private TagService tagService;

    @RequestMapping(value = "/newCard", method = RequestMethod.POST)
    public String onNewTag(@RequestParam("cardId") String cardId, HttpServletRequest request) {
        String fridgeSn = request.getHeader("Fridge-ID");
        logger.info("收到tagId:{},fridge id:{}", cardId, fridgeSn);
        tagService.onTag(cardId, fridgeSn);
        return "收到tagId:" + cardId;
    }
}
