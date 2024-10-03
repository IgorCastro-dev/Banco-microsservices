package com.igor.account_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerid;

    @Column(nullable = false,unique = true,name = "account_number")
    private String accountNumber;

    @Column(unique = true,nullable = false, length = 11)
    private String cpf;

    @Column(nullable = false,length = 100,name = "full_name")
    private String fullName;

    @Column(nullable = false)
    private boolean enable;
}
