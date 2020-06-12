package com.faya.co.elog.repository;

import com.faya.co.elog.domain.Error;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ErrorRepository extends JpaRepository<Error,Long> {
}
