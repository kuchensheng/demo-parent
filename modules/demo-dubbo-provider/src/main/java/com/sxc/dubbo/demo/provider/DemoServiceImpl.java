package com.sxc.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.sxc.dubbo.demo.sdk.DemoService;

import java.time.LocalDateTime;

/**
 * Desription:
 *
 * @author:Hui CreateDate:2019/7/24 0:10
 * version 1.0
 */
@Service(version = "1.0",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}")
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello() {
        return "Hello, time is "+ LocalDateTime.now().toString();
    }

    @Override
    public String sayHello(String name) {
        return "Hello,"+ name +","+LocalDateTime.now().toString();
    }

}
