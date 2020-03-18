package com.xue.service;

import com.xue.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemServiceFallback implements ItemFeignClient {
    /**
     * 服务降级的方法要和原方法一致(名称、参数列表)
     * @param id
     * @return
     */
    @Override
    public Item queryItemById(Long id) {
        return new Item(id, "服务降级方法queryItemById", null, "服务降级方法queryItemById", null);
    }


}
