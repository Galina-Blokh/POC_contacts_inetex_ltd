package com.inetexltd.mycontacts.app.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@javax.persistence.Entity
@Table(name = "users")
public class User extends SuperEntity {
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
}
