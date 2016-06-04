package com.easyDriving.service;

import com.easyDriving.dao.SubjectDao;
import com.easyDriving.pojo.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Created by hexing on 15-12-15.
 */
@Service
public class SubjectService{

    @Autowired
    private SubjectDao subjectDao;

    //添加测试题
    public void addTest(Subject subject) throws IOException {
        subjectDao.addTest(subject);
    }

    //获得测试题
    public Subject getTest(String s_type, String method, int id) throws IOException {
        return subjectDao.getTest(s_type,method,id);
    }

    //获得试题的总数
    public int getTotalCount(String s_type) throws IOException {
        return subjectDao.getTotalCount(s_type);
    }

    //获得某一科目有多少章节
    public int getTotalChapter(String s_type) throws IOException {
        return subjectDao.getTotalChapter(s_type);
    }
}
