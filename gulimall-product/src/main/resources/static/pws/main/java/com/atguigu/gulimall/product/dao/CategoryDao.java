package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dengzhiming
 * @email 1206291365@qq.com
 * @date 2020-10-10 20:02:04
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
