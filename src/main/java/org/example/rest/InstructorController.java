package org.example.rest;

import org.example.rest.entity.Instructor;
import org.example.rest.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/instructors")
public class InstructorController {
    private final InstructorService instructorService;

    public InstructorController(InstructorService instructorService) {
        this.instructorService = instructorService;
    }

    @GetMapping("")
    public List<Instructor> getInstructors() {
        return instructorService.getInstructors();
    }

    @GetMapping("{id}")
    public Instructor getInstructorById(Long id) {
        return instructorService.getInstructorById(id);
    }

    @PostMapping("")
    public Instructor createInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @PutMapping("")
    public Instructor updateInstructor(@RequestBody Instructor instructor) {
        return instructorService.saveInstructor(instructor);
    }

    @DeleteMapping("/{id}")
    public void deleteInstructor(@PathVariable Long id) {
        instructorService.deleteInstructor(id);
    }
}
