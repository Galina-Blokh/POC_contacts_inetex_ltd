package com.inetexltd.mycontacts.app.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@Table(name = "addresses")
public class PbAddress extends PbSuperUser {
    @Column(name = "country")
    private  String country;
    @Column(name = "city")
    private  String city;
    @Column(name = "house_number")
    private String houseNumber;
    @Column(name = "apartment")
    private String apartment;

    @ManyToOne
    private PbUser user;

}
