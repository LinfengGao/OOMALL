package xmu.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xmu.config.SpringConfig;
import xmu.domain.Order;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testGetById(){
        Order order = orderService.getById(1);
        System.out.println(order);
    }

    @Test
    public void testGetAll(){
        List<Order> all = orderService.getAll();
        System.out.println(all);
    }

}

