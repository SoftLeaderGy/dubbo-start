package com.yang.user_service_provider.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author: Guo.Yang
 * @Date: 2022/09/22/15:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAddress {
    private Integer id;
    private String userAddress; //用户地址
    private String userId; //用户id
    private String consignee; //收货人
    private String phoneNum; //电话号码
    private String isDefault; //是否为默认地址    Y-是     N-否
}
