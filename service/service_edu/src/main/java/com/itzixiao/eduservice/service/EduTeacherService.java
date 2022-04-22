package com.itzixiao.eduservice.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itzixiao.eduservice.entity.EduTeacher;

import java.util.Map;

public interface EduTeacherService extends IService<EduTeacher> {

    //1 分页查询讲师的方法
    Map<String, Object> getTeacherFrontList(Page<EduTeacher> pageTeacher);
}
