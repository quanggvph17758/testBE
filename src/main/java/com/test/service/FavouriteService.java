package com.test.service;

import com.test.entities.Favourite;

import java.util.List;

public interface FavouriteService {

    List<Favourite> listAll();

    Favourite create(Favourite fav);

    Favourite delete(int id);

    List<Favourite> findByUserId(int id);
}
