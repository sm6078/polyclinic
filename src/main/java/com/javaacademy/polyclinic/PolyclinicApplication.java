package com.javaacademy.polyclinic;

import com.javaacademy.polyclinic.office.BoxOffice;
import com.javaacademy.polyclinic.office.Polyclinic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PolyclinicApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(PolyclinicApplication.class, args);
        Polyclinic polyclinic = context.getBean(Polyclinic.class);
        polyclinic.treatDentist();
        polyclinic.treatTherapist();
        polyclinic.treatJuniorSurgeon();
        polyclinic.treatSeniorSurgeon();
        BoxOffice boxOffice = context.getBean(BoxOffice.class);
        boxOffice.printIncome();
        context.close();
   }
}
