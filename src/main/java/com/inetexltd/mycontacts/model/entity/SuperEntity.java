package com.inetexltd.mycontacts.model.entity;

import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDate;

@MappedSuperclass
@NoArgsConstructor
@Getter @Setter
public abstract class SuperEntity {

    @Column(name = "id")
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "created_date")
    @CreatedDate
    private LocalDate  createdDate;

}
