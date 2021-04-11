package com.example.zaky.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student jack = new Student(
                    "Jack",
                    "jack.jamal@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    21
            );

            Student budi = new Student(
                    "budi",
                    "budi@gmail.com",
                    LocalDate.of(2000, JANUARY, 5),
                    20
            );

            repository.saveAll(
                    List.of(jack,budi)
            );
        };
    }
}
