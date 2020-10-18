package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dengzhiming
 * @email 1206291365@qq.com
 * @date 2020-10-04 20:55:41
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
