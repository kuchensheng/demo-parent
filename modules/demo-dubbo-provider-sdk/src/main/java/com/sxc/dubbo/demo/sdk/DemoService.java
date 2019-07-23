package com.sxc.dubbo.demo.sdk;

/**
 * ClassName:DemoService
 * Description: TODO
 *
 * @author: kuchensheng
 * @version: Create at: Dubbo demo sdk 10:33
 * _
 * Copyright:   Copyright (c)2019
 * Company:     songxiaocai
 * _
 * Modification History:
 * Date              Author      Version     Description
 * ------------------------------------------------------------------
 * Dubbo demo sdk 10:33   kuchensheng    1.0
 */
public interface DemoService {

    String sayHello();

    String sayHello(String name);
}
