package com.inetexltd.mycontacts.repository;

import com.inetexltd.mycontacts.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<User, Long> {
}
