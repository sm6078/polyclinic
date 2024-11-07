package com.javaacademy.polyclinic.office;

import com.javaacademy.polyclinic.staff.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Polyclinic {
    private final List<Doctor> doctors;
    private final BoxOffice boxOffice;
    private static final int INDEX_DENTIST = 0;
    private static final int INDEX_THERAPIST = 1;
    private static final int INDEX_JUNIOR_SURGEON = 2;
    private static final int INDEX_SENIOR_SURGEON = 3;

    public void treatDentist() {
        boxOffice.acceptPayment(doctors.get(INDEX_DENTIST).treat());
    }

    public void treatTherapist() {
        boxOffice.acceptPayment(doctors.get(INDEX_THERAPIST).treat());
    }

    public void treatJuniorSurgeon() {
        boxOffice.acceptPayment(doctors.get(INDEX_JUNIOR_SURGEON).treat());
    }

    public void treatSeniorSurgeon() {
        boxOffice.acceptPayment(doctors.get(INDEX_SENIOR_SURGEON).treat());
    }
}
