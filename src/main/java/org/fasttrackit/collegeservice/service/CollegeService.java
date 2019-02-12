package org.fasttrackit.collegeservice.service;

import org.fasttrackit.collegeservice.dto.CollegeDTO;
import org.fasttrackit.collegeservice.model.CollegeMajor;
import org.fasttrackit.collegeservice.repo.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Transactional
    public List<CollegeDTO> getAllCollegeMajors() {
        List<CollegeDTO> result = new ArrayList<>();
        Iterator<CollegeMajor> iterator = collegeRepository.findAll().iterator();
        while (iterator.hasNext()) {
            CollegeMajor next = iterator.next();
            result.add(ConvertorUtils.convertToDto(next));
        }
        return result;
    }


}
