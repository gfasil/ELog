package com.faya.co.learnspringboot.data.repo;

import com.faya.co.learnspringboot.data.entity.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepo extends CrudRepository<Room,Long> {
}
