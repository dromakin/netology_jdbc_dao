package com.dromakin.netology_jdbc_dao.models;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "orders")
@Data
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column
    String date;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

    @Column(name = "product_name", nullable = false)
    String productName;

    @Column
    int amount;
}
