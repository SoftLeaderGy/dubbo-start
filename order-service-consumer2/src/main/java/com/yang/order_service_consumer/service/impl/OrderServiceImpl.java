package com.yang.order_service_consumer.service.impl;

import com.yang.gmail_interface.pojo.UserAddress;
import com.yang.gmail_interface.service.OrderService;
import com.yang.gmail_interface.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Guo.Yang
 * @Date: 2022/09/22/19:49
 */
@Service("OrderServiceImpl")
public class OrderServiceImpl implements OrderService {

    //查询用户的收货地址
    UserService userService;

    public void initOrder(String userID) {
        //查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userID);
        System.out.println(userAddressList);
    }
}
