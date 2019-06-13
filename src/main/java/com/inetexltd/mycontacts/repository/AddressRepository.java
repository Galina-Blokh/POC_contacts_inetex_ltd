package com.inetexltd.mycontacts.app.repository;

import com.inetexltd.mycontacts.app.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
