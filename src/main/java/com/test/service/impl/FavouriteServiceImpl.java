package com.test.service.impl;

import com.test.entities.Favourite;
import com.test.repository.FavouriteRepository;
import com.test.service.FavouriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteServiceImpl implements FavouriteService {

    @Autowired
    FavouriteRepository favRepo;

    @Override
    public List<Favourite> listAll() {
        return favRepo.findAll();
    }

    @Override
    public Favourite create(Favourite fav) {
        return favRepo.save(fav);
    }

    @Override
    public Favourite delete(int id) {

        Favourite fav = favRepo.findOne(id);
        if(fav != null) {
            favRepo.delete(fav);
        }

        return fav;
    }

    @Override
    public List<Favourite> findByUserId(int id) {

        return favRepo.listByUserId(id);
    }
}
