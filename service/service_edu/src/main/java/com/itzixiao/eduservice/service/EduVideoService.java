package com.itzixiao.eduservice.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itzixiao.eduservice.entity.EduVideo;

/**
 * <p>
 * 课程视频 服务类
 * </p>
 *
 * @author zixiao
 * @since 2020-03-02
 */
public interface EduVideoService extends IService<EduVideo> {

    //1 根据课程id删除小节
    void removeVideoByCourseId(String courseId);
}
