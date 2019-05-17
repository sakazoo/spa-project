package com.sakazoo.spasample.controller;

import com.sakazoo.spasample.domain.Currency;
import com.sakazoo.spasample.service.CurrencyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

  private final CurrencyService currencyService;

  @GetMapping("/")
  public ResponseEntity<CurrencyResponse> findAll() {
    List<Currency> currencies = currencyService.findAll();
    CurrencyResponse currencyResponse = CurrencyResponse.builder()
            .currencies(currencies)
            .build();
    return new ResponseEntity<>(currencyResponse, HttpStatus.OK);
  }
}
