package org.fasttrackit.collegeservice.repo;

import org.fasttrackit.collegeservice.model.College;
import org.fasttrackit.collegeservice.model.CollegeMajor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface CollegeRepository extends
        PagingAndSortingRepository<College, Long> {


    List<College> findCollegeMajorByName(String name);


}
