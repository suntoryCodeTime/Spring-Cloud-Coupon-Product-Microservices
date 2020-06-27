package com.suntorycodetime.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suntorycodetime.springcloud.model.Coupon;

public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
