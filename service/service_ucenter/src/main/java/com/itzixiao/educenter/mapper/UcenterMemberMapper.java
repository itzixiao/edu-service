package com.itzixiao.educenter.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itzixiao.educenter.entity.UcenterMember;

/**
 * <p>
 * 会员表 Mapper 接口
 * </p>
 *
 * @author zixiao
 * @since 2020-03-09
 */
public interface UcenterMemberMapper extends BaseMapper<UcenterMember> {

    //查询某一天注册人数
    Integer countRegisterDay(String day);
}
