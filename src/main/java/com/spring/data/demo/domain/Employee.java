package com.spring.data.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idemployee;

    private String firstName;

    private String lastName;

    private String email;

    private Date startDate;

    private Long salary;

    @ManyToOne
    @JoinColumn(name = "iddepartment")
    private Department department;

    @OneToOne
    @JoinColumn(name = "iddesk")
    private Desk desk;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "employee_table",
            joinColumns = @JoinColumn(name = "idemployee"),
            inverseJoinColumns = @JoinColumn(name = "idproject"))
    private List<Project> projects;

}
