package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){

        return args -> {

         Student mariam =    new Student("Mariam", "mariams.jama@gmail.com", LocalDate.of(2008, Month.JANUARY, 5));
         Student prosper =    new Student("prosper", "prosper.collins@gmail.com", LocalDate.of(1998, Month.JULY, 6));
         repository.saveAll(List.of(mariam, prosper));

        };
    }
} 
