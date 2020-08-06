package com.faya.co.elog.repository;

import com.faya.co.elog.domain.Error;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ErrorRepository extends MongoRepository<Error,Long> {
}
