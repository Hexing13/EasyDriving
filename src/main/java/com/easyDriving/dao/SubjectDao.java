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

    //获得试题的总数
    public int getTotalCount(String s_type) throws IOException {
        SqlSession sqlSession = MybatisUtils.getSession();
        try {
            SubjectMapper subjectMapper = sqlSession.getMapper(SubjectMapper.class);
            return subjectMapper.getTotalCount(s_type);
        }finally {
            sqlSession.close();
        }
    }

    //获得某一科目有多少章节
    public int getTotalChapter(String s_type) throws IOException {
        SqlSession sqlSession = MybatisUtils.getSession();
        try {
            SubjectMapper subjectMapper = sqlSession.getMapper(SubjectMapper.class);
            return subjectMapper.getTotalChapter(s_type);
        }finally {
            sqlSession.close();
        }
    }
}
