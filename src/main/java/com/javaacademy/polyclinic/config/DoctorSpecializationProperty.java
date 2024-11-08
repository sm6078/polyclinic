package com.javaacademy.polyclinic.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "doc.specialization")
@Data
@AllArgsConstructor
public class DoctorSpecializationProperty {
    private String doc1;
    private String doc2;
    private String doc3;
}
