package com.easyDriving.dao;

import com.easyDriving.mapper.SubjectMapper;
import com.easyDriving.pojo.Subject;
import com.easyDriving.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.io.IOException;

/**
 * Created by hexing on 15-12-15.
 */
@Repository
public class SubjectDao{

    //添加测试题
    public void addTest(Subject subject) throws IOException {
        SqlSession sqlSession = MybatisUtils.getSession();
        try {
            SubjectMapper subjectMapper = sqlSession.getMapper(SubjectMapper.class);
            subjectMapper.addTest(subject);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }
    }

    //获得测试题
    public Subject getTest(String s_type, String method, int id) throws IOException {
        SqlSession sqlSession = MybatisUtils.getSession();
        try {
            SubjectMapper subjectMapper = sqlSession.getMapper(SubjectMapper.class);
            return subjectMapper.getTest(s_type,id);
        }finally {
            sqlSession.close();
        }
    }
}
