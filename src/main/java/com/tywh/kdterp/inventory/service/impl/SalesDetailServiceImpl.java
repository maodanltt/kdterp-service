package com.tywh.kdterp.inventory.service.impl;

import com.tywh.kdterp.inventory.mapper.SalesDetailMapper;
import com.tywh.kdterp.inventory.service.SalesDetailService;
import com.tywh.kdterp.pojo.QueryCondition;
import com.tywh.kdterp.pojo.SalesDetail;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SalesDetailServiceImpl implements SalesDetailService {

    @Autowired
    private SalesDetailMapper salesDetailMapper;

    @Override
    public List<SalesDetail> getSalesDetailList(QueryCondition queryCondition) throws Exception{

        return salesDetailMapper.querySalesDetailList(queryCondition);
    }
}
