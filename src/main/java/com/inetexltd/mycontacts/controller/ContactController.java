package com.inetexltd.mycontacts.controller;


import com.inetexltd.mycontacts.model.dto.ContactDTO;
import com.inetexltd.mycontacts.service.IContactDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ContactController {

    @Autowired
    IContactDTOService contactDTOService;


    @PostMapping(value = "/addContact")
    public void addContact(@RequestBody ContactDTO contactDto) {
        contactDTOService.addContact(contactDto);
    }

    @GetMapping(value = "/getContactByName/{id}")
     ContactDTO getContact(@PathVariable("fullName")String fullName, @PathVariable("id") Long id){
        return contactDTOService.getContactByName(fullName, id);
    }

    @GetMapping(value = "/getContactByPhone/{id}")
    ContactDTO getContactByPhone(@PathVariable("phoneNumber") String phone, @PathVariable("id") Long id){
        return contactDTOService.getContactByPhone(phone, id);
    }

    @GetMapping(value = "/getAll")
    List<ContactDTO> getAll(){
        return contactDTOService.getAllContacts();
    }

    @PostMapping(value = "/delete/{id}")
    void deleteContact(@PathVariable("id") Long id){
        contactDTOService.deleteContact(id);
    }

    @PostMapping(value = "/update/{id}")
    void updateContact(@PathVariable("id") Long id,@RequestBody ContactDTO contactDTO){
        contactDTOService.updateContact(id,contactDTO);
    }


}
