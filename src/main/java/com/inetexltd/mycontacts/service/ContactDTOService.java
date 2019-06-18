package com.inetexltd.mycontacts.service;

import com.inetexltd.mycontacts.model.dto.ContactDTO;
import com.inetexltd.mycontacts.model.entity.User;
import com.inetexltd.mycontacts.repository.AddressRepository;
import com.inetexltd.mycontacts.repository.PhoneNumberRepository;
import com.inetexltd.mycontacts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class ContactDTOService implements IContactDTOService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PhoneNumberRepository phoneNumberRepository;
    @Autowired
    private AddressRepository addressRepository;


    @Override
    public List<ContactDTO> getAllContacts() {
        return null;
    }

    @Override
    public ContactDTO getContactByName(String fullName, Long id) {
        return null;
    }

    @Override
    public ContactDTO getContactByPhone(String phoneNumber, Long id) {
        return null;
    }

    @Override
    public void addContact(ContactDTO contactDTO) {


    }

    @Override
    public void deleteContact(Long id) {

    }

    @Override
    public void updateContact(Long id, ContactDTO contactDTO) {

    }
}

