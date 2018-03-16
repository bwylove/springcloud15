/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: UserController
 * Author:   92406
 * Date:     2018/3/16 9:32
 * Description: 对外提供服务
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.bwy.servicehizipkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/16 9:32
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public String hi(){
        return "I'm forezp";
    }
}
