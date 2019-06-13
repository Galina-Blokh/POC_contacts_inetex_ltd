package com.inetexltd.mycontacts.app.repository;

import com.inetexltd.mycontacts.app.model.entity.PbUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PbUserRepository extends JpaRepository<PbUser, Long> {
}
