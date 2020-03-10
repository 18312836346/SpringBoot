package com.scs.soft.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@RunWith(SpringRunner.class)//测试启动器，并加载spring Boot注解

@SpringBootTest   //标记spring Boot单元测试，并加载项目的applicationContext上下文环境
public class Chapter01ApplicationTests {

    @Autowired
    private HelloController helloController;
    @Test
  public   void contextLoads() {
      String hello =  helloController.hello();
        System.out.println(hello);
    }

}
