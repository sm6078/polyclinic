package com.javaacademy.polyclinic.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "doc.price")
@Data
@AllArgsConstructor
public class DoctorPriceProperty {
    private String dentist;
    private String therapist;
    private String juniorSurgeon;
    private String seniorSurgeon;
}
