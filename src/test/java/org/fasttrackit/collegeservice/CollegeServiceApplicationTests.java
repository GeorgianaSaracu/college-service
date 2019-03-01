package org.fasttrackit.collegeservice;

import org.fasttrackit.collegeservice.dto.CollegeDTO;
import org.fasttrackit.collegeservice.dto.CollegeMajorDTO;
import org.fasttrackit.collegeservice.dto.StudentDTO;
import org.fasttrackit.collegeservice.service.CollegeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.ConfigFileApplicationContextInitializer;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CollegeServiceApplication.class,
        loader = SpringApplicationContextLoader.class,
        initializers = ConfigFileApplicationContextInitializer.class)
public class CollegeServiceApplicationTests {

    @Autowired
    private CollegeService collegeService;

    @Test
	public void testSave() {

        CollegeDTO collegeDto = new CollegeDTO();

        collegeDto.setName("Facultatea de mate info");
        List<CollegeMajorDTO> majors = new ArrayList<>();
        CollegeMajorDTO major =new CollegeMajorDTO();
        major.setName("Sectie Mate");
        major.setAvailableSpots(23);
        majors.add(major);

        CollegeMajorDTO major2 =new CollegeMajorDTO();
        major2.setName("Sectie Info Engleza");
        major2.setAvailableSpots(20);
        majors.add(major2);

        collegeDto.setCollegeMajors(majors);

        List<StudentDTO> students= new ArrayList<>();
        StudentDTO student = new StudentDTO("Campean","Ana");
        students.add(student);
        StudentDTO student1 = new StudentDTO("Campean","Ana");
        students.add(student1);
        StudentDTO student2= new StudentDTO("Campean","Ana");
        StudentDTO student3 = new StudentDTO("Campean","Ana");
        StudentDTO student4= new StudentDTO("Campean","Ana");
        StudentDTO student5 = new StudentDTO("Campean","Ana");

        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        collegeDto.setStudents(students);

        collegeService.save(collegeDto);
	}

}

