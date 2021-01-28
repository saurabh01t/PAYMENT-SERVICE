package com.techie.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techie.entity.Payment;
import com.techie.repo.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	private PaymentRepository paymentRepo;
	
	public Payment doPayment(Payment payment) {
		payment.setPaymentSts(paymentProcessing());
		payment.setTxId(UUID.randomUUID().toString());
		return paymentRepo.save(payment);
	}
	
	public String paymentProcessing() {
		//api should be third party payment gateway(paypal, paytm....)
		return new Random().nextBoolean()?"Success":"fail";
	}
}
