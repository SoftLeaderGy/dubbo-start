package order;


import com.yang.order_service_consumer.pojo.UserAddress;
import com.yang.order_service_consumer.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Description:
 * @Author: Guo.Yang
 * @Date: 2022/09/22/15:48
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "河南省郑州巩义市宋陵大厦2F", "1", "安然", "150360313x", "Y");
        UserAddress address2 = new UserAddress(2, "北京市昌平区沙河镇沙阳路", "1", "情话", "1766666395x", "N");
        return Arrays.asList(address1,address2);
    }
}
