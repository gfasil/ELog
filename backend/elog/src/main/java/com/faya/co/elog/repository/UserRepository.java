package com.faya.co.elog.repository;

import com.faya.co.elog.domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,Long> {
}
