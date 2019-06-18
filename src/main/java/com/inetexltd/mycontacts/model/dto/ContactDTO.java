package com.inetexltd.mycontacts.model.dto;


import com.inetexltd.mycontacts.model.entity.PhoneNumber;


import lombok.*;

import java.util.List;
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@Builder
public class ContactDTO {
    private String fullName;
    private String email;
    private List<PhoneNumber> phoneNumbers;
    private List<AddressDTO> address ;



}
