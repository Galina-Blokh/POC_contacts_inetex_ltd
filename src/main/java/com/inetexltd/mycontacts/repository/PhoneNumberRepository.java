package com.inetexltd.mycontacts.repository;

import com.inetexltd.mycontacts.model.entity.PhoneNumber;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface PhoneNumberRepository extends JpaRepository<PhoneNumber,Long> {
    @Override
    List<PhoneNumber> findAll();
    List<PhoneNumber> findPhoneNumberByUser();


}
