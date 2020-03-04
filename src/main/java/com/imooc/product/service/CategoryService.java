package com.imooc.product.service;

import com.imooc.product.dataobject.ProductCategory;

import java.util.List;

//类目
public interface CategoryService {
    //这个和dao一样，意义不大，统一封装
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
