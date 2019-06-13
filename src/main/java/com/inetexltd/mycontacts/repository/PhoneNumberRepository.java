package com.inetexltd.mycontacts.app.repository;

import com.inetexltd.mycontacts.app.model.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber,Long> {
}
