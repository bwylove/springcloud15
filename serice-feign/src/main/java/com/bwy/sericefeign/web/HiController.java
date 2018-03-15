/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: HiController
 * Author:   92406
 * Date:     2018/3/15 16:28
 * Description: 消费
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.bwy.sericefeign.web;

import com.bwy.sericefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/15 16:28
 */
@RestController
public class HiController {

    @Autowired
    SchedualServiceHi schedualServiceHi;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
