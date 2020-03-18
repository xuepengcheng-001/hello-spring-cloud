package com.xue.zhellorabbit;

import com.xue.zhellorabbit.hello.RabbitProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ZhelloRabbitApplication.class)
class ZhelloRabbitApplicationTests {

    @Autowired
    private RabbitProvider rabbitProvider;

    @Test
    void contextLoads() {
        for (int i = 0; i <10 ; i++) {
            rabbitProvider.send();
        }
    }

}
