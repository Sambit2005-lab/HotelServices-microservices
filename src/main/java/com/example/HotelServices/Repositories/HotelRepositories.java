package com.example.HotelServices.Repositories;

import com.example.HotelServices.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepositories extends JpaRepository<Hotel,String> {


}
