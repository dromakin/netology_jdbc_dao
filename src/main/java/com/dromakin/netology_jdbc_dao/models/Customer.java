package com.dromakin.netology_jdbc_dao.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 20)
    String name;

    @Column(length = 20)
    String surname;

    @Column
    Integer age;

    @Column(length = 40, name = "phone_number")
    String phoneNumber;
}
