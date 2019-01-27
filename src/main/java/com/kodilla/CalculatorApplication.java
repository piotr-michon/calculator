package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(CalculatorApplication.class, args);
        Calculator calculator = new Calculator();

        System.out.println("2 + 3 = " + calculator.addAToB(2,3));
        System.out.println("3 - 2 = " + calculator.subtractAFromB(3,2));
    }
}

