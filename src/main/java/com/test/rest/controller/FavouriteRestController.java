package com.test.rest.controller;

import com.test.entities.Favourite;
import com.test.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/favourite")
public class FavouriteRestController {

    @Autowired
    FavouriteService favSer;

    @GetMapping
    public List<Favourite> list() {

        return favSer.listAll();
    }

    @PostMapping
    public Favourite create(@RequestBody Favourite fav) {

        return favSer.create(fav);
    }


    @DeleteMapping(path =  {"/{id}"})
    public Favourite delete(@PathVariable("id") int id) {

        return favSer.delete(id);
    }

    @GetMapping(path =  {"/{id}"})
    public List<Favourite> listByUserId(@PathVariable("id") int id) {

        return favSer.findByUserId(id);
    }

}
