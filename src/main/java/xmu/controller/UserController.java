package xmu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import xmu.domain.User;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    //POST为添加操作
    @PostMapping
    public Map<String, Object> save() {
        System.out.println("user save...");
        Map<String, Object> map = new HashMap<>();
        map.put("module", "user save");
        return map;
    }

    //DELETE为删除操作，设定请求参数，路径变量
    @DeleteMapping("/{id}")
    public Map<String, Object> delete(@PathVariable Integer id) {
        System.out.println("user delete..." + id);
        Map<String, Object> map = new HashMap<>();
        map.put("module", "user delete");
        return map;
    }

    //
    @PutMapping
    public Map<String, Object> update(@RequestBody User user) {
        System.out.println("user update..." + user);
        Map<String, Object> map = new HashMap<>();
        map.put("module", "user update");
        return map;
    }
}
