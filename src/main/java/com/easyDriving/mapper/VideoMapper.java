package com.easyDriving.mapper;

import com.easyDriving.pojo.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hexing on 15-12-15.
 */
public interface VideoMapper {
    //获得某一科目有多少视频
    @Select("select *from video where v_type=#{v_type}")
    public List<Video> getTotalVideo(@Param("v_type")String v_type);

}
