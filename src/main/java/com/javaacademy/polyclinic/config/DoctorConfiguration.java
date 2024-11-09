package com.javaacademy.polyclinic.config;

import com.javaacademy.polyclinic.staff.Doctor;
import com.javaacademy.polyclinic.staff.SpecializationEnum;
import lombok.AllArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

import static java.math.BigDecimal.valueOf;

@Configuration
@EnableConfigurationProperties(DoctorPriceProperty.class)
@AllArgsConstructor
public class DoctorConfiguration {
    private DoctorPriceProperty doctorPriceProperty;

    @Bean
    public Doctor dentist() {
        return new Doctor(SpecializationEnum.DENTIST,
                valueOf(Long.parseLong(doctorPriceProperty.getDentist())));
    }

    @Bean
    public Doctor therapist() {
        return new Doctor(SpecializationEnum.THERAPIST,
                new BigDecimal(doctorPriceProperty.getTherapist()));
    }

    @Bean
    public Doctor juniorSurgeon() {
        return new Doctor(SpecializationEnum.SURGEON,
                new BigDecimal(doctorPriceProperty.getJuniorSurgeon()));
    }

    @Bean
    public Doctor seniorSurgeon() {
        return new Doctor(SpecializationEnum.SURGEON,
                new BigDecimal(doctorPriceProperty.getSeniorSurgeon()));
    }
}
