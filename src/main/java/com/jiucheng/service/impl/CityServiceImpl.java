package com.jiucheng.service.impl;

import com.jiucheng.dao.Icity;
import com.jiucheng.service.IcityService;
import com.jiucheng.vo.city;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * CityServiceImpl
 *
 * @auther qiaoba
 * @date 2020/9/28 0028 17:03
 **/

@Service
public class CityServiceImpl implements IcityService{

    @Autowired
    public Icity icity;

    public List<city> findAll(){
        List<city> all = icity.findAll();
        return all;
    }
}
