package com.crossoverJie.service;

import com.crossoverJie.pojo.Content;
import com.crossoverJie.pojo.T_user;

import java.util.List;
import java.util.Set;

/**
 * Created with IDEA
 * Created by ${jie.chen} on 2016/7/14.
 * 后台登录Service
 */
public interface ContentService {
    List<Content> findContentList();

    int insertSelective(Content content) ;
}
