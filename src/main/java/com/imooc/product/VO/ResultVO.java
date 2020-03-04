package com.imooc.product.VO;

import lombok.Data;
//展示对象最外层结构
@Data
public class ResultVO<T> {

    private Integer code;
    private String msg;
    private T data;
}
