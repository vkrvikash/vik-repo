package com.example.currencyexchangeservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.currencyexchangeservice.bean.ExchangeValue;

@Repository
public interface ExchangeValueRepostory extends JpaRepository<ExchangeValue,Long>{

	public ExchangeValue findByFromAndTo(String from, String to);
}
