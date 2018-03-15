/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: SchedualServiceHi
 * Author:   92406
 * Date:     2018/3/15 16:26
 * Description: 定义一个feign的接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.bwy.sericefeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/15 16:26
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
