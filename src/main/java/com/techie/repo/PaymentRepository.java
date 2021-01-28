package com.techie.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techie.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

}
