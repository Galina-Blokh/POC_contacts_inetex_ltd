package com.inetexltd.mycontacts.model.dto;


import com.inetexltd.mycontacts.model.entity.Address;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
public class AddressDTO {

    private  String country;
    private  String city;
    private String street;
    private String houseNumber;
    private String apartment;
}
