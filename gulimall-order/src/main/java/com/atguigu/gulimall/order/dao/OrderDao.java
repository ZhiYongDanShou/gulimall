package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author LinHaojia
 * @email 1326813696@qq.com
 * @date 2022-04-13 16:56:42
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
