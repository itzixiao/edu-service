package com.itzixiao.educms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itzixiao.educms.entity.CrmBanner;

import java.util.List;

public interface CrmBannerService extends IService<CrmBanner> {

    //查询所有banner
    List<CrmBanner> selectAllBanner();
}
