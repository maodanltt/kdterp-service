package com.tywh.kdterp.inventory.service;

import com.tywh.kdterp.pojo.QueryCondition;
import com.tywh.kdterp.pojo.SalesDetail;

import java.util.List;

public interface SalesDetailService {

    List<SalesDetail> getSalesDetailList(QueryCondition queryCondition) throws Exception;
}
