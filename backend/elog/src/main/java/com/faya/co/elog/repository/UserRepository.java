package com.faya.co.elog.repository;

import com.faya.co.elog.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
