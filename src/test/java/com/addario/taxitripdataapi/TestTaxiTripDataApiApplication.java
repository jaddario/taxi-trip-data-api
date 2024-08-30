package com.addario.taxitripdataapi;

import org.springframework.boot.SpringApplication;

public class TestTaxiTripDataApiApplication {

  public static void main(String[] args) {
    SpringApplication.from(TaxiTripDataApiApplication::main).with(TestcontainersConfiguration.class).run(args);
  }

}
