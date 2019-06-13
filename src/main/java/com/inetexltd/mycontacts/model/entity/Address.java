package com.inetexltd.mycontacts.app.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@Table(name = "addresses")
public class Address extends SuperEntity {
    @Column(name = "country")
    private  String country;
    @Column(name = "city")
    private  String city;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "apartment")
    private String apartment;

    @ManyToOne
    private User user;

}
