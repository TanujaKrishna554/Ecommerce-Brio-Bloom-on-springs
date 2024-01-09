package com.jsp.ecommerce1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ecommerce1.dto.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails, Integer>
{

}