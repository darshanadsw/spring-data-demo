package com.spring.data.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer iddesk;

    private Integer number;

    private String location;

}
