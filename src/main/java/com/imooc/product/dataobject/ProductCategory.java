package com.imooc.product.dataobject;
//类目表
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
@Entity
public class ProductCategory {
    @Id
    //strategy(自增)不标注,jpa的查询方法会报错
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String categoryName;
    //类目编号，对应商品表
    private Integer categoryType;
    private Date createTime;
    private Date updateTime;
}
