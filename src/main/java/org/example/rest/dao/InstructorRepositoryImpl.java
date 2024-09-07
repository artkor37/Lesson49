package org.example.rest.dao;

import lombok.RequiredArgsConstructor;
import org.example.rest.entity.Instructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@RequiredArgsConstructor
@Repository
public class InstructorRepositoryImpl implements InstructorRepository {
    private final SessionFactory sessionFactory;

    @Override
    public List<Instructor> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Instructor", Instructor.class)
                .getResultList();
    }

    @Override
    public Instructor findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Instructor.class, id);
    }

    @Override
    public Instructor save(Instructor instructor) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(instructor);
        return instructor;
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Instructor instructor = session.get(Instructor.class, id);
        session.delete(instructor);
    }
}
