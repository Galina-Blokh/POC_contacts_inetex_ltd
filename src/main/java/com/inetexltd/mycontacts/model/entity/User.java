package com.inetexltd.mycontacts.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class User extends SuperEntity {
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
}
