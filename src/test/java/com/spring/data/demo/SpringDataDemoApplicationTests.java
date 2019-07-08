package com.spring.data.demo;

import com.spring.data.demo.domain.DatCase;
import com.spring.data.demo.domain.DatField;
import com.spring.data.demo.domain.Employee;
import com.spring.data.demo.services.EmployeeService;
import org.h2.table.SubQueryInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.*;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@TestPropertySource(locations = {"classpath:test-application.properties"})
public class SpringDataDemoApplicationTests {

    @PersistenceContext
    private EntityManager em;

    @Test
    public void contextLoads() {

        Employee emp = Employee.builder()
                .firstName("Darshana")
                .salary(72000L)
                .startDate(Date.from(LocalDate.of(2018, 8, 29)
                        .atStartOfDay(ZoneId.systemDefault()).toInstant()))
                .build();

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Employee> c = cb.createQuery(Employee.class);
        Root<Employee> root = c.from(Employee.class);

        c.select(root);

        List<Employee> employees = em.createQuery(c).getResultList();

        System.out.println(employees.size());
    }

    @Test
    public void testDatCase(){

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<DatCase> c = cb.createQuery(DatCase.class);

        Root<DatCase> root = c.from(DatCase.class);

        Subquery<DatCase> sq1 = c.subquery(DatCase.class);
        Root<DatField> datFieldRoot = sq1.from(DatField.class);
        sq1.select(datFieldRoot.get("datCase")).where(cb.equal(datFieldRoot.get("fieldName"),"EHR"),
                cb.equal(datFieldRoot.get("fieldValue"),"YES"));

        Subquery<DatCase> sq2 = c.subquery(DatCase.class);
        Root<DatField> datFieldRoot1 = sq2.from(DatField.class);
        sq2.select(datFieldRoot1.get("datCase")).where(cb.equal(datFieldRoot1.get("fieldName"),"EHR"));


        c.distinct(true).select(root)
                .where(cb.or(cb.in(root).value(sq1),cb.not(cb.in(root).value(sq2))));


        List<DatCase> result = em.createQuery(c).getResultList();

        result.forEach(o-> System.out.println(o.getId()));

    }

}
