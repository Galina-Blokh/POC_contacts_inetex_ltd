package com.inetexltd.mycontacts.app.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@javax.persistence.Entity
@Table(name = "phoneNumbers")
public class PhoneNumber extends SuperEntity {
    @Column(name = "phone_number")
    private  String phoneNumber;

    @ManyToOne
    private User user;

}
