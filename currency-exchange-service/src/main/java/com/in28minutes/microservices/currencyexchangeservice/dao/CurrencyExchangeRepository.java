package com.in28minutes.microservices.currencyexchangeservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.in28minutes.microservices.currencyexchangeservice.Controller.model.CurrencyExchange;

public interface CurrencyExchangeRepository extends JpaRepository<CurrencyExchange, Long>{

	@Query("Select c from CurrencyExchange c where c.from=:from and c.to=:to")
	CurrencyExchange findByFromAndTo(String from, String to);

}
