package com.wudi.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/14 14:58
 */
@Data
public class BaseData implements Serializable {

    /**
     * 产品id
     */
    private String productId;

    /**
     * 产品名称
     */
    private String productName;
}
