package com.javaacademy.polyclinic.staff;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@Slf4j
public class Doctor {
    private String specialization;
    public BigDecimal price;

    public BigDecimal treat() {
        log.info("Врач со специализацие {} вылечил человека", specialization);
        return price;
    }
}
