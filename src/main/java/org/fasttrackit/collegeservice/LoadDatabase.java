package org.fasttrackit.collegeservice;

import lombok.extern.slf4j.Slf4j;

import org.fasttrackit.collegeservice.model.Student;
import org.fasttrackit.collegeservice.repo.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(StudentRepository repository) {
        return args -> {
            repository.save(new Student("Georgiana", "Saracu", 1, 9.6));
            repository.save(new Student("Andreea", "Danis", 2, 6.9));
        };
    }

}
