package com.inetexltd.mycontacts.service;

import com.inetexltd.mycontacts.model.dto.ContactDTO;

import java.util.List;

public interface IContactDTOService {
   List<ContactDTO> getAllContacts();
    ContactDTO getContactByName(String fullName);
    ContactDTO getContactByPhone(String phoneNumber);
     void addContact(ContactDTO contactDTO);
     void deleteContactByName(String fullName);
    void deleteContactByPhone(String phoneNumber);
    void updateContact(ContactDTO contactDTO);



}
