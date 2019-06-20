package com.inetexltd.mycontacts.repository;

import com.inetexltd.mycontacts.model.dto.ContactDTO;
import com.inetexltd.mycontacts.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findAll();
}
