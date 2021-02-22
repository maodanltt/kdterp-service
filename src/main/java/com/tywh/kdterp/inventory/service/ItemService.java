package com.tywh.kdterp.inventory.service;

import com.tywh.kdterp.pojo.Condition;

import java.util.Map;

public interface ItemService {

    Map<String,Object> queryItem(Condition condition);
}
