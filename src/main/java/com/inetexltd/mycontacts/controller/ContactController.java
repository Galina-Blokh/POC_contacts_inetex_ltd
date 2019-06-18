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
    public void addContact(@PathVariable("id") Long id, @RequestBody ContactDTO contactDto) {
        contactDTOService.addContact(contactDto);
    }

    @GetMapping(value = "/getContactByName")
     ContactDTO getContact(@PathVariable("fullName")String fullName){
        return contactDTOService.getContactByName(fullName);
    }

    @GetMapping(value = "/getContactByPhone")
    ContactDTO getContactByPhone(@PathVariable("phoneNumber") String phone){
        return contactDTOService.getContactByPhone(phone);
    }

    @GetMapping(value = "/getAll")
    List<ContactDTO> getAll(){
        return contactDTOService.getAllContacts();
    }

    @PostMapping(value = "/deleteByName")
    void deleteContactByName(@PathVariable("fullName") String fullName){
        contactDTOService.deleteContactByName(fullName);
    }

    @PostMapping(value = "/deleteByPhone")
    void deleteContactByPhone(@PathVariable("phoneNumber") String phoneNumber){
        contactDTOService.deleteContactByPhone(phoneNumber);
    }
    @PostMapping(value = "/update")
    void updateContact(@RequestBody ContactDTO contactDTO){
        contactDTOService.updateContact(contactDTO);
    }


}
