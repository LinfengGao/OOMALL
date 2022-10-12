package xmu.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xmu.domain.Order;

import java.util.List;

@Transactional
public interface OrderService {
    /**
     * 保存账单
     * @param order
     * @return
     */
    public boolean save(Order order);

    /**
     * 修改账单
     * @param order
     * @return
     */
    public boolean update(Order order);

    /**
     * 根据id删除记录
     * @param id
     * @return
     */
    public boolean delete(Integer id);

    /**
     * 根据id查询记录
     * @param id
     * @return
     */
    public Order getById(Integer id);

    /**
     * 查询所有记录
     * @return
     */
    public List<Order> getAll();
}
