package org.fasttrackit.collegeservice.repo;

import org.fasttrackit.collegeservice.model.CollegeMajor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;


public interface CollegeMajorRepository extends
        PagingAndSortingRepository<CollegeMajor, Long> {


    public List<CollegeMajor> findCollegeMajorByName(String name);

    @Query("select a from CollegeMajor a where name like ?1%")
    public List<CollegeMajor> findCollegeMajorWhereNameLike(String namePart);

}
