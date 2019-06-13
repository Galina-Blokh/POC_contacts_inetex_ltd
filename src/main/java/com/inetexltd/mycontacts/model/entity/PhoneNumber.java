package com.inetexltd.mycontacts.model.entity;

import lombok.*;

import javax.persistence.*;

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
    @JoinColumn
    private User user;

}
