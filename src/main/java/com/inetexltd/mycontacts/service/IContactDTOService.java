package com.inetexltd.mycontacts.service;

import com.inetexltd.mycontacts.model.dto.ContactDTO;

import java.util.List;

public interface IContactDTOService {
    public List<ContactDTO> getAllContacts();
    public ContactDTO getContactByName(String fullname);
    public ContactDTO getContactByPhone(String phoneNumber);
    public boolean addContact( ContactDTO contactDTO);
    public boolean deleteContactByName(String fullName);
    public boolean deleteContactByPhone(String phoneNumber);



}
