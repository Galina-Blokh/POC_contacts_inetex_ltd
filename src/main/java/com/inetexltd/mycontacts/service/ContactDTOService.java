package com.inetexltd.mycontacts.service;

import com.inetexltd.mycontacts.model.dto.ContactDTO;
import com.inetexltd.mycontacts.model.entity.User;
import com.inetexltd.mycontacts.repository.AddressRepository;
import com.inetexltd.mycontacts.repository.ContactRepository;
import com.inetexltd.mycontacts.repository.PhoneNumberRepository;
import com.inetexltd.mycontacts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class ContactDTOService implements IContactDTOService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PhoneNumberRepository phoneNumberRepository;
    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private ContactRepository contactRepository;


    @Override
    public List<ContactDTO> getAllContacts() {
        return contactRepository
                .findAll().addAll(List<ContactDTO>);




    }

    @Override
    public ContactDTO getContact(Long id) {
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

