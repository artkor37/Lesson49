package org.example.rest.service;

import lombok.RequiredArgsConstructor;
import org.example.rest.dao.InstructorRepository;
import org.example.rest.entity.Instructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@RequiredArgsConstructor
@Service
public class InstructorServiceImpl implements InstructorService {
    private final InstructorRepository instructorRepository;

    @Override
    @Transactional
    public List<Instructor> getInstructors() {
        return instructorRepository.findAll();
    }

    @Override
    @Transactional
    public Instructor getInstructorById(Long id) {
        return instructorRepository.findById(id);
    }

    @Override
    @Transactional
    public Instructor saveInstructor(Instructor instructor) {
        return instructorRepository.save(instructor);
    }

    @Override
    @Transactional
    public void deleteInstructor(Long id) {
        instructorRepository.delete(id);
    }
}
