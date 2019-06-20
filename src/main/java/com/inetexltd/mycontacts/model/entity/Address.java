package com.inetexltd.mycontacts.model.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
@Table(name = "addresses")
public class Address extends SuperEntity {
    @Column(name = "country")
    private  String country;
    @Column(name = "city")
    private  String city;
    @Column(name = "street")
    private String street;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "apartment")
    private String apartment;

    @ManyToOne
    @JoinColumn(name = "user", nullable = true)
    private User user;

}
