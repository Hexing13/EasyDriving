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
public class SubjectServiceImp implements SubjectService{

    @Autowired
    private SubjectDao subjectDao;
    //添加测试题
    @Override
    public void addTest(Subject subject) throws IOException {
        subjectDao.addTest(subject);
    }

    //获得测试题
    @Override
    public Subject getTest(String s_type, String method, int id) throws IOException {
        return subjectDao.getTest(s_type,method,id);
    }
}
