package com.spring.data.demo.services;

import com.spring.data.demo.domain.Employee;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Service
public class EmployeeService {

    @PersistenceContext
    private EntityManager em;

    public void saveEmployee(Employee employee){
        em.persist(employee);
    }
}
