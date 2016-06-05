package com.easyDriving.service;

import com.easyDriving.dao.VideoDao;
import com.easyDriving.pojo.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * Created by hexing on 15-12-15.
 */
@Service
public class VideoService {
    @Autowired
    VideoDao videoDao;
    //获得某一科目有多少视频
    public List<Video> getTotalVideo(String v_type) throws IOException {
         return videoDao.getTotalVideo(v_type);
    }
}
