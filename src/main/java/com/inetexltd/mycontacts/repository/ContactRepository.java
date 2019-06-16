package com.inetexltd.mycontacts.repository;

import com.inetexltd.mycontacts.model.dto.ContactDTO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ContactRepository extends JpaRepository<ContactDTO, Long> {
    @Override
    List<ContactDTO> findAll();
    List<ContactDTO> findByFullNameStartingWith(String fullName);
}
