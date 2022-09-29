package com.test.rest.controller;

import com.test.entities.Order;
import com.test.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/yourorder")
public class YourOrderRestController {

    @Autowired
    OrderService orderSer;

    @GetMapping(path =  {"/{id}"})
    public List<Order> listByUserId(@PathVariable("id") int uid) {

        return orderSer.findByUserId(uid);
    }
}
