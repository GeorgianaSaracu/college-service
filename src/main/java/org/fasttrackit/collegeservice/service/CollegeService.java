package org.fasttrackit.collegeservice.service;

import org.fasttrackit.collegeservice.dto.CollegeDTO;
import org.fasttrackit.collegeservice.model.College;
import org.fasttrackit.collegeservice.model.CollegeMajor;
import org.fasttrackit.collegeservice.repo.CollegeMajorRepository;
import org.fasttrackit.collegeservice.repo.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;


@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    @Transactional
    public List<CollegeDTO> getAllCollege() {
        List<CollegeDTO> result = new ArrayList<>();
        Iterator<College> iterator = collegeRepository.findAll().iterator();
        while (iterator.hasNext()) {
            College next = iterator.next();
            result.add(ConvertorUtils.convertToDto(next));
        }
        return result;
    }


    public CollegeDTO getById(long id) {

        College byIdCollege = collegeRepository.findOne(id);
        return ConvertorUtils.convertToDto(byIdCollege);
    }

    public void save(CollegeDTO collegeDto) {

        College college= ConvertorUtils.convert(collegeDto);

        collegeRepository.save(college);
    }
}
