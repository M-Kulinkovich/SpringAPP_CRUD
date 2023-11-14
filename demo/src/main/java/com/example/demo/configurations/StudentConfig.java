package com.example.demo.configurations;

import com.example.demo.models.Student;
import com.example.demo.repositories.StudentRepository;
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
            Student Max = new Student(
                    "Max",
                    LocalDate.of(2000, Month.JANUARY, 12),
                    "mmmaaaxxx@mail.com"
            );

            Student Alex = new Student(
                    "Alex",
                    LocalDate.of(2009, Month.FEBRUARY, 2),
                    "alexalex@gmail.com"
            );

            Student MMMASD = new Student(
                    "Alexis",
                    LocalDate.of(2005, Month.FEBRUARY, 15),
                    "wwaasdsaf@gmail.com"
            );

            repository.saveAll(
                    List.of(Max, Alex)
            );
        };
    }
}
