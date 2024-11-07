package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.staff.Doctor;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

@Configuration
@EnableConfigurationProperties({DoctorSpecializationProperty.class, DoctorPriceProperty.class})
@AllArgsConstructor
public class DoctorConfiguration {
    private DoctorSpecializationProperty doctorSpecializationProperty;
    private DoctorPriceProperty doctorPriceProperty;

    @Bean
    public Doctor dentist() {
        return new Doctor(doctorSpecializationProperty.getDentist(),
                valueOf(Long.parseLong(doctorPriceProperty.getDentist())));
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(doctorSpecializationProperty.getTherapist(),
                new BigDecimal(doctorPriceProperty.getTherapist()));
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(doctorSpecializationProperty.getSurgeon(),
                new BigDecimal(doctorPriceProperty.getJuniorSurgeon()));
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(doctorSpecializationProperty.getSurgeon(),
                new BigDecimal(doctorPriceProperty.getSeniorSurgeon()));
    }
}
