/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HelloController
 * Author:   92406
 * Date:     2018/3/15 16:10
 * Description: controller调用service
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.bwy.serviceribbon.Controller;

import com.bwy.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/15 16:10
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
}
