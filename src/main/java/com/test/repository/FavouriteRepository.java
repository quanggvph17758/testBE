package com.test.repository;

import com.test.entities.Favourite;
import com.test.entities.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface FavouriteRepository extends Repository<Favourite, Integer> {

    List<Favourite> findAll();

    @Query("Select fav From Favourite fav Where fav.id=:id ")
    Favourite findOne(int id);

    @Query("select fav from Favourite fav where upper(fav.user_id) like upper(?1) ")
    List<Favourite> listByUserId(int id);

    Favourite save(Favourite fav);

    void delete(Favourite fav);
}
