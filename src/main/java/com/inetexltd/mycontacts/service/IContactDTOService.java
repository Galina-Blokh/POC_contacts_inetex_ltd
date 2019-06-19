package com.inetexltd.mycontacts.service;

import com.inetexltd.mycontacts.model.dto.ContactDTO;

import java.util.List;

public interface IContactDTOService {
     List<ContactDTO> getAllContacts();
     ContactDTO getContact(Long id);
     void addContact(ContactDTO contactDTO);
     void deleteContact(Long id);
     void updateContact(Long id, ContactDTO contactDTO);



}
