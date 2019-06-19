package com.inetexltd.mycontacts.model.dto;


import com.inetexltd.mycontacts.model.entity.Address;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@Builder
public class AddressDTO extends Address {

    private  String country;
    private  String city;
    private String houseNumber;
    private String apartment;
}
