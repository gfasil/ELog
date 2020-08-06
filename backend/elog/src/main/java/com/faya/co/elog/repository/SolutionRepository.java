package com.faya.co.elog.repository;

import com.faya.co.elog.domain.Solution;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SolutionRepository  extends MongoRepository<Solution,Long> {
}
