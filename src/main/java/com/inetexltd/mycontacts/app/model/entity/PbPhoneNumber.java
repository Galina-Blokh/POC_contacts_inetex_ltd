package com.inetexltd.mycontacts.app.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@Entity
@Table(name = "phoneNumbers")
public class PbPhoneNumber extends PbSuperUser {
    @Column(name = "phone_number")
    private  String phoneNumber;

}
