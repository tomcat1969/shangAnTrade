package com.shangan.trade.order;

import com.alibaba.fastjson.JSON;


import com.shangan.trade.goods.db.dao.GoodsDao;
import com.shangan.trade.goods.db.model.Goods;
import com.shangan.trade.order.db.dao.OrderDao;

import com.shangan.trade.order.db.model.Order;

import com.shangan.trade.order.service.OrderService;
import com.shangan.trade.order.utils.SnowflakeIdWorker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderTest {
    @Autowired
    private OrderDao orderDao;

    @Autowired
    GoodsDao goodsDao;

    @Autowired
    private OrderService orderService;

    @Test
    public void insertGoodsTest() {
        System.out.println("Hello");
        Order order = new Order();

        //use snowflake
        SnowflakeIdWorker sw = new SnowflakeIdWorker(1,1);
        order.setUserId(778l);
        order.setGoodsId(sw.nextId());
        order.setPayTime(new Date());
        order.setPayPrice(88800);
        boolean insertresult = orderDao.insertOrder(order);
        System.out.println(insertresult);
    }

    @Test
    public void insertGoodsTest2() {
        orderService.createOrder(6,6);
    }

    @Test
    public void queryGoodsTest() {

        Goods goods = goodsDao.queryGoodsById(17);
        System.out.println(JSON.toJSONString(goods));
    }

    @Test
    public void queryOrderTest() {

        Order order = orderDao.queryOrderById(13L);
        System.out.println(JSON.toJSONString(order));
    }


}

