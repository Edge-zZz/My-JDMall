package com.cloud.mall.cloudorder.dao;

import com.cloud.mall.cloudorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author k
 * @email 2261933439@qq.com
 * @date 2022-05-30 19:43:23
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
