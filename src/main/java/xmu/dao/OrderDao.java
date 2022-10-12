package xmu.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import xmu.domain.Order;

import java.util.List;

public interface OrderDao {

    @Insert("insert into orders (customer_id, consignee) values(#{customer_id}, #{consignee})")
    public void save(Order order);

    @Update("update orders set customer_id = #{customer_id}, consignee = #{consignee} where id = #{id}")
    public void update(Order order);

    @Delete("delete from orders where id = #{id}")
    public void delete(Integer id);

    @Select("select * from orders where id = #{id}")
    public Order getById(Integer id);

    @Select("select * from orders")
    public List<Order> getAll();
}
