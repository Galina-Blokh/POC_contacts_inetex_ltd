package com.inetexltd.mycontacts.model.dto;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@Builder
public class AddressDTO {

    private  String country;
    private  String city;
    private String houseNumber;
    private String apartment;
}
