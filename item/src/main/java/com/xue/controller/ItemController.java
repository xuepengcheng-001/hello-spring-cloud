package com.xue.controller;

import com.xue.entity.Item;
import com.xue.entity.JdbcConfigBean;
import com.xue.service.ItemService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @Value("${server.port}")
    private String port;

    @Autowired
    private JdbcConfigBean jdbcConfigBean;
    /**
     * 对外提供接口服务，查询商品信息
     *
     * @param id
     * @return
     */
    @GetMapping(value = "item/{id}")
    public Item queryItemById(@PathVariable("id") Long id) {
        Item item = itemService.queryItemById(id);
        item.setPort(port);
        return item;
    }

    @GetMapping("testConfig")
    public String testConfig(){
        return jdbcConfigBean.toString();
    }






}
