package com.easyDriving.dao;

import com.easyDriving.mapper.VideoMapper;
import com.easyDriving.pojo.Video;
import com.easyDriving.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.List;

/**
 * Created by hexing on 15-12-15.
 */
@Repository
public class VideoDao {

    //获得某一科目有多少视频
    public List<Video> getTotalVideo(String v_type) throws IOException {
        SqlSession sqlSession = MybatisUtils.getSession();
        VideoMapper videoMapper = sqlSession.getMapper(VideoMapper.class);
        try {
            return videoMapper.getTotalVideo(v_type);
        }finally {
            sqlSession.close();
        }
    }
}
