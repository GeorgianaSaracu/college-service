package org.fasttrackit.collegeservice.repo;

import org.fasttrackit.collegeservice.model.Student;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface StudentRepository extends
        PagingAndSortingRepository<Student, Long> {
}
