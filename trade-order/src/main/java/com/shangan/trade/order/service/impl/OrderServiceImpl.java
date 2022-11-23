package com.shangan.trade.order.service.impl;

//import com.shangan.trade.goods.db.dao.GoodsDao;

import com.shangan.trade.order.db.dao.OrderDao;
import com.shangan.trade.order.db.model.Order;
import com.shangan.trade.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderDao orderDao;
//    @Autowired
//    private GoodsDao goodsDao;



    @Override
    public Order createOrder(long userId, long goodsId) {


        return null;
    }
}
