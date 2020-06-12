package com.faya.co.learnspringboot.data.service;

import com.faya.co.learnspringboot.data.entity.Room;
import com.faya.co.learnspringboot.data.repo.RoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {

        @Autowired
        RoomRepo roomRepo;
    @Override
    public Iterable<Room> findAll() {
        return roomRepo.findAll();
    }
}
