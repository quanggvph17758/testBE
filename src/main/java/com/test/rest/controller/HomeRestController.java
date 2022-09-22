package com.test.rest.controller;

import com.test.entities.Product;
import com.test.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/home")
public class HomeRestController {

    @Autowired
    ProductService proSer;

    @GetMapping(path = {"/{id}"})
    public List<Product> listByCategoryId(@PathVariable("id") int id) {

        return proSer.findByCategoryId(id);
    }
}
