package org.example.rest.service;

import org.example.rest.entity.Car;
import org.example.rest.entity.Instructor;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface InstructorService {

    List<Instructor> getInstructors();

    Instructor getInstructorById(Long id);

    Instructor saveInstructor(Instructor instructor);

    void deleteInstructor(Long id);
}
