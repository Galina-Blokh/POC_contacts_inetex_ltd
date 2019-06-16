package com.inetexltd.mycontacts.service;

import com.inetexltd.mycontacts.model.dto.ContactDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactDTOService implements IContactDTOService{

    @Override
    public List<ContactDTO> getAllContacts() {
        return null;
    }

    @Override
    public ContactDTO getContactByName(String fullname) {
        return null;
    }

    @Override
    public boolean addContact(ContactDTO contactDTO) {
        return false;
    }

    @Override
    public boolean deleteContactByName(String fullName) {
        return false;
    }
}
