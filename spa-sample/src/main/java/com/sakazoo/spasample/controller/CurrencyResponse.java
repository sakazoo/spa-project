package com.sakazoo.spasample.controller;

import com.sakazoo.spasample.domain.Currency;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class CurrencyResponse {

  private List<Currency> currencies;
}
