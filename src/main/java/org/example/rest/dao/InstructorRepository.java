package org.example.rest.dao;

import org.example.rest.entity.Instructor;

import java.util.List;

public interface InstructorRepository {
    List<Instructor> findAll();
    Instructor findById(Long id);
    Instructor save(Instructor instructor);
    void delete(Long id);
}
