package com.inetexltd.mycontacts.app.model.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@EqualsAndHashCode
@Entity
@Table(name = "users")
public class PbUser extends PbSuperUser{
    @Column(name = "full_name")
    private String fullName;
    @Email
    @Column(name = "email")
    private String email;
}
