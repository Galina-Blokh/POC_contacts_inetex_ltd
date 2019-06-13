package com.inetexltd.mycontacts.repository;

import com.inetexltd.mycontacts.model.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber,Long> {
}
