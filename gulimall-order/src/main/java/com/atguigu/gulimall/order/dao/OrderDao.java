package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dengzhiming
 * @email 1206291365@qq.com
 * @date 2020-10-04 21:09:45
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
