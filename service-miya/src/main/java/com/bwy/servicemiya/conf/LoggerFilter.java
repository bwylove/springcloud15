/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: LoggerFilter
 * Author:   92406
 * Date:     2018/3/16 10:01
 * Description: 链路自定义数据
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名          修改时间           版本号             描述
 */


package com.bwy.servicemiya.conf;

import com.netflix.zuul.ZuulFilter;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 * @author baijh
 * @version V1.0
 * @Description: ${todo}
 * @date 2018/3/16 10:01
 */
@Component
public class LoggerFilter extends ZuulFilter {

    @Autowired
    Tracer tracer;
    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {

        tracer.addTag("operator","forezp");
        System.out.print(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
