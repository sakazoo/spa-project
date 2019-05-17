package com.sakazoo.spasample.service;

import com.sakazoo.spasample.domain.Currency;
import com.sakazoo.spasample.domain.CurrencyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyService {

  private final CurrencyRepository currencyRepository;

  public List<Currency> findAll() {
    return currencyRepository.findAll();
  }
}
