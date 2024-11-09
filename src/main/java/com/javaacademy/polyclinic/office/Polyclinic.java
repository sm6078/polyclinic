package com.javaacademy.polyclinic.office;

import com.javaacademy.polyclinic.staff.Doctor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RequiredArgsConstructor
public class Polyclinic {
    //private final List<Doctor> doctors;
    private final Map<String, Doctor> doctors;
    private final BoxOffice boxOffice;


    //Ты захотел сделать универсальное решение, но вот эта конструкция не даст тебе этой универсальности
    /*
    private static final int INDEX_DENTIST = 0;
    private static final int INDEX_THERAPIST = 1;
    private static final int INDEX_JUNIOR_SURGEON = 2;
    private static final int INDEX_SENIOR_SURGEON = 3;
     */

    /*public void treatDentist() {
        threat(doctors.get(INDEX_DENTIST));
    }

    public void treatTherapist() {
        threat(doctors.get(INDEX_THERAPIST));
    }

    public void treatJuniorSurgeon() {
        threat(doctors.get(INDEX_JUNIOR_SURGEON));
    }

    public void treatSeniorSurgeon() {
        threat(doctors.get(INDEX_SENIOR_SURGEON));
    }
    */

    /*public void treatAllDoctors() {
        for (Doctor doctor: doctors) {
            threat(doctor);
        }
    }*/

    public void threatDentist() {
        threat(doctors.get("dentist"));
    }

    public void threatTherapist() {
        threat(doctors.get("therapist"));
    }

    public void threatJuniorSurgeon() {
        threat(doctors.get("juniorSurgeon"));
    }

    public void threatSeniorSurgeon() {
        threat(doctors.get("seniorSurgeon"));
    }

    private void threat(Doctor doctor) {
        boxOffice.acceptPayment(doctor.treat());
    }
}
