package com.easyDriving.service;

import com.easyDriving.pojo.Subject;

import java.io.IOException;

/**
 * Created by hexing on 15-12-15.
 */
public interface SubjectService {
    //添加测试题
    public void addTest(Subject subject) throws IOException;

    //获得测试题
    public Subject getTest(String s_type,String method,int id) throws IOException;
}
