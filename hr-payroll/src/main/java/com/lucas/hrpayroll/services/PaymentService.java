package com.lucas.hrpayroll.services;


import com.lucas.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public Payment getPayment(Long workerId, int days){
        return new Payment("Lucas", 21.1, days);
    }
}
