package com.cloud.mall.cloudproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.common.utils.PageUtils;
import com.cloud.mall.cloudproduct.entity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author k
 * @email 2261933439@qq.com
 * @date 2022-05-30 15:09:49
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

