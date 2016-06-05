package com.easyDriving.controller;

import com.easyDriving.pojo.Video;
import com.easyDriving.service.VideoService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.util.List;

/**
 * Created by hexing on 15-12-15.
 */
@Controller
@RequestMapping("video")
public class VideoController {
    @Autowired
    VideoService videoService;

    @RequestMapping()
    public String getIndex() {
        return "kaoshi";
    }

    //获得某一科目有多少视频
    @RequestMapping(value = "getvideo",method = RequestMethod.POST)
    public @ResponseBody
    String getTotalVideo(@RequestParam String v_type) throws IOException {
        List<Video> videos= videoService.getTotalVideo(v_type);
        JSONArray jsonArray = JSONArray.fromObject(videos);
        System.out.println(jsonArray);
        return jsonArray.toString();
    }
}
