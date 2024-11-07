package com.javaacademy.polyclinic.office;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

@Component
@Slf4j
public class BoxOffice {
    private BigDecimal income = ZERO;

    public void acceptPayment(BigDecimal amount) {
        income = income.add(amount);
    }

    public void printIncome() {
        log.info("Прибыль поликлиники: {}", income.toString());
    }
}
