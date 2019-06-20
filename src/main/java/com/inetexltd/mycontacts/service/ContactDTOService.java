package com.inetexltd.mycontacts.service;

import com.inetexltd.mycontacts.exeptions.NotFoundRuntimeExeption;
import com.inetexltd.mycontacts.model.dto.ContactDTO;
import com.inetexltd.mycontacts.model.entity.Address;
import com.inetexltd.mycontacts.model.entity.User;
import com.inetexltd.mycontacts.repository.AddressRepository;
import com.inetexltd.mycontacts.repository.PhoneNumberRepository;
import com.inetexltd.mycontacts.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
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
    @Transactional(readOnly = true)
    public List<ContactDTO> getAllContacts() {
        return  contactRepository
                    .findAll()
                    .stream()
                    .map(user-> getContact(user.getId()))
                    .collect(Collectors.toList());
    }

    @Override
    @Transactional(readOnly = true)
    public ContactDTO getContact(Long id) {
        User user = userRepository
                    .findById(id)
                    .orElseThrow(()-> new NotFoundRuntimeExeption(id + "User doesn't exists"));

       //TODO

        return null;
    }

    @Override
    @Transactional(readOnly = true)
    public void addContact(ContactDTO contactDTO) {
        User user = User.builder()
                .fullName(contactDTO.getFullName())
                .email(contactDTO.getEmail())
                .build();
        userRepository.save(user);
        List<Address> addresses = Address.builder()
                .country(contactDTO.)
                .city()
                .street()
                .houseNumber()
                .apartment()
                .build();


//TODO

    }

    @Override
    @Transactional(readOnly = true)
    public void deleteContact(Long id) {
       User user = userRepository
                    .findById(id)
                    .orElseThrow(()-> new NotFoundRuntimeExeption(id + "User doesn't exists"));
       userRepository.deleteById(id);
       addressRepository.deleteById(id);
       phoneNumberRepository.deleteById(id);
    }

    @Override
    @Transactional(readOnly = true)
    public void updateContact(Long id, ContactDTO contactDTO) {
//TODO
    }
}

