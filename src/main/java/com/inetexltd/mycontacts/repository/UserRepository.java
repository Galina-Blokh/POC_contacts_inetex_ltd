package com.inetexltd.mycontacts.app.repository;

import com.inetexltd.mycontacts.app.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
