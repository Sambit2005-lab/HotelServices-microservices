package com.example.HotelServices.Services.impl;

import com.example.HotelServices.Exception.ResouceNotFoundException;
import com.example.HotelServices.Repositories.HotelRepositories;
import com.example.HotelServices.Services.HotelServices;
import com.example.HotelServices.entities.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl implements HotelServices {

   @Autowired
    private HotelRepositories hotelRepositories;
    @Override
    public Hotel create(Hotel hotel) {
       return hotelRepositories.save(hotel);
    }

    @Override
    public List<Hotel> GetAll() {
        return hotelRepositories.findAll();
    }

    @Override
    public Hotel get(String id) {
        return hotelRepositories.findById(id).orElseThrow(() -> new ResouceNotFoundException("hotel with this name not found"));
    }
}
