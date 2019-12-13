package com.carl.demo.service.impl;

import com.carl.demo.mapper.DemoMapper;
import com.carl.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author carl.he
 * @Date 2019/12/13
 **/
@Component
public class DemoServiceImpl implements DemoService {

    @Resource
    private DemoMapper demoMapper;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public String queryProductNameById(Long id) {
        String productName = demoMapper.queryProductNameById(id);
        return productName;
    }
}
