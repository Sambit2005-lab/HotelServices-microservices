package com.example.HotelServices.Services;

import com.example.HotelServices.entities.Hotel;

import java.util.List;

public interface HotelServices {

    //create
    Hotel create(Hotel hotel);

    //GetAll
    List<Hotel> GetAll();

    //get single
    Hotel get(String id);
}
