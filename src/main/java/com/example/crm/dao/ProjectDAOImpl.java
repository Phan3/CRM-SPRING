package com.example.crm.dao;

import com.example.crm.entity.Employee;
import com.example.crm.entity.Project;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProjectDAOImpl implements ProjectDAO{

    @Autowired
    EntityManager entityManager;

    @Override
    public List<Project> findAll() {
        TypedQuery<Project> query = entityManager.createQuery("from Project ", Project.class);
        return query.getResultList();
    }

    @Override
    public Project save(Project project) {
        return entityManager.merge(project);
    }

    @Override
    @Transactional
    public Project findById(long id) {
        return entityManager.find(Project.class, id);
    }

    @Override
    public List<Project> findByName(String name) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
