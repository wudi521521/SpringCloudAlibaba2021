package com.wudi.fallback;

import com.wudi.clients.ProductClient;
import com.wudi.model.BaseData;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dillon Wu
 * @Description:
 * @date 2021/2/16 15:23
 */
@Component
public class ProductClientFallBack implements ProductClient {
    private Map<String,Object> map = new HashMap<>();
    @Override
    public String showMsg() {
        return "客户端端降级不可用";
    }

    @Override
    public Map<String, Object> findOne(String productId) {
        map.put("status","false");
        map.put("msg","当前查询不可用findOne");
        return map;
    }

    @Override
    public Map<String, Object> findAll(BaseData baseData) {
        map.put("status","false");
        map.put("msg","当前查询不可用findAll");
        return map;
    }

    @Override
    public Map<String, Object> findOnePost(String productId) {
        map.put("status","false");
        map.put("msg","当前查询不可用findAllPost");
        return map;
    }

    @Override
    public Map<String, Object> findAllPost(BaseData baseData) {
        map.put("status","false");
        map.put("msg","当前查询不可用findAllPost");
        return map;
    }
}
