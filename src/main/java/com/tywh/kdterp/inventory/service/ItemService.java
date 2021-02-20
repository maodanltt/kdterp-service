package com.tywh.kdterp.inventory.service;

import java.util.Map;

public interface ItemService {

    Map<String,Object> queryItem(Condition condition);
}
