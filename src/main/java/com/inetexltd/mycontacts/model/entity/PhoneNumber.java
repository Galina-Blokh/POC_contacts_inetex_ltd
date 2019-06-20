package com.inetexltd.mycontacts.model.entity;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "phoneNumbers")
public class PhoneNumber extends SuperEntity {
    @Column(name = "phone_number")
    private  String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "user", nullable = true)
    private User user;

}
