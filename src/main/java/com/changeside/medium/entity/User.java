package com.changeside.medium.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @SequenceGenerator(
            name = "user_id_sequence",
            sequenceName = "user_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_id_sequence"
    )
    Long id;

    @Column(name = "name_surname")
    String fullName;
    @Column(name = "birth_date")
    LocalDate birthDate;
    @Column(name = "user_email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "is_Active")
    Boolean isActive;


}
