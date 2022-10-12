package xmu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xmu.domain.Order;
import xmu.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public boolean save(@RequestBody Order order) {
        return orderService.save(order);
    }

    @PutMapping
    public boolean update(@RequestBody Order order) {
        return orderService.update(order);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return orderService.delete(id);
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Integer id) {
        return orderService.getById(id);
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAll();
    }
}
