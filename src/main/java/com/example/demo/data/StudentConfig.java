package com.example.demo.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student jeric = new Student(
                    "jeric",
                    "jeric@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );
            Student ayn = new Student(
                    "ayn",
                    "ayn@gmail.com",
                    LocalDate.of(2020, Month.APRIL, 5)
            );
            repository.saveAll(
                    List.of(jeric, ayn)
            );
        };
    }

}
