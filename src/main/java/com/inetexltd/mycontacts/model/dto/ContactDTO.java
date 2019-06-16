package com.inetexltd.mycontacts.model.dto;


import com.inetexltd.mycontacts.model.entity.PhoneNumber;


import lombok.*;

@AllArgsConstructor
@Getter @Setter
@Builder
public class ContactDTO {
    private String fullName;
    private String email;
    private PhoneNumber phoneNumbers [];
    private AdressDTO address [];



}
