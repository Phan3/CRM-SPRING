package com.example.crm.dao;

import com.example.crm.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    @Transactional
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    @Transactional
    public Employee findById(long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        entityManager.createQuery("delete from Employee where id=:id").setParameter("id", id).executeUpdate();
    }

    @Override
    @Transactional
    public List<Employee> findByName(String name) {
        TypedQuery<Employee> query = entityManager.createQuery("from Employee where firstName=:firstName", Employee.class);
        query.setParameter("firstName", name);
        return query.getResultList();
    }
}
