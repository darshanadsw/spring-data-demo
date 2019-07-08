package com.spring.data.demo.domain;

import lombok.*;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DatField {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String fieldName;

    private String fieldValue;

    @ManyToOne
    private DatCase datCase;

}
