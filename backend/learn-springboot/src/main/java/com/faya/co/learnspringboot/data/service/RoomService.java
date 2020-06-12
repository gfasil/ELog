package com.faya.co.learnspringboot.data.service;

import com.faya.co.learnspringboot.data.entity.Room;
import org.springframework.stereotype.Service;

@Service
public interface RoomService {
    Iterable<Room> findAll();
}
