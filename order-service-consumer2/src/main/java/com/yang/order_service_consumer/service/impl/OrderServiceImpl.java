package order;

import com.yang.order_service_consumer.pojo.UserAddress;
import com.yang.order_service_consumer.service.OrderService;
import com.yang.order_service_consumer.service.UserService;
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

    @Override
    public void initOrder(String userID) {
        //查询用户的收货地址
        List<UserAddress> userAddressList = userService.getUserAddressList(userID);
        System.out.println(userAddressList);
    }
}
