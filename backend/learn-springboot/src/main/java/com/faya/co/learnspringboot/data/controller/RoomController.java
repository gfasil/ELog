package com.faya.co.learnspringboot.data.controller;

import com.faya.co.learnspringboot.data.entity.Room;
import com.faya.co.learnspringboot.data.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping(value="")
    public Iterable<Room>  getAll()
    {
        return roomService.findAll();
    }
}
