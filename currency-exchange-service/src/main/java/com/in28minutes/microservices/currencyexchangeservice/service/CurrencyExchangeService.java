package com.in28minutes.microservices.currencyexchangeservice.service;

import com.in28minutes.microservices.currencyexchangeservice.Controller.model.CurrencyExchange;

public interface CurrencyExchangeService {

	CurrencyExchange findByFromAndTo(String from, String to);

}
