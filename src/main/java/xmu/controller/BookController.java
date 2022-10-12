package xmu.controller;

import org.springframework.web.bind.annotation.*;
import xmu.domain.Book;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/books")
public class BookController {

    @PostMapping
    public Map<String,Object> save(@RequestBody Book book){
        System.out.println("book save..."+book);
        Map<String,Object> map=new HashMap<>();
        map.put("module","book save");
        return map;
    }
}
