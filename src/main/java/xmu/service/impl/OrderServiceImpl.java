package xmu.service.impl;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xmu.dao.OrderDao;
import xmu.domain.Order;
import xmu.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public boolean save(Order order) {
        orderDao.save(order);
        return true;
    }

    @Override
    public boolean update(Order order) {
        orderDao.update(order);
        return true;
    }

    @Override
    public boolean delete(Integer id) {
        orderDao.delete(id);
        return true;
    }

    @Override
    public Order getById(Integer id) {
        return orderDao.getById(id);
    }

    @Override
    public List<Order> getAll() {
        return orderDao.getAll();
    }
}
