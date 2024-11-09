package com.javaacademy.polyclinic.staff;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SpecializationEnum {
    DENTIST("Стоматолог"),
    THERAPIST("Терапевт"),
    SURGEON("Хирург");

    private final String russianSpecialization;
}
