package com.inetexltd.mycontacts.repository;

import com.inetexltd.mycontacts.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AddressRepository extends JpaRepository<Address, Long> {
}
