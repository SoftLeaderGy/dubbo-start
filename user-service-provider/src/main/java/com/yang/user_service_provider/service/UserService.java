package com.yang.user_service_provider.service;

import com.yang.user_service_provider.pojo.UserAddress;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: Guo.Yang
 * @Date: 2022/09/22/15:47
 */
@Service
public interface UserService {
       /**
        * 按照用户id返回所有的收货地址
        * @param userId
        * @return
        */
        public List<UserAddress> getUserAddressList(String userId);
}
