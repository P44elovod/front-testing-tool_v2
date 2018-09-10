package com.p44elovod.fronttestingtool.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String persEmail;
    private String workEmail;
    private LocalDate birthDate;
    private Integer cellPhone;




    @OneToOne
    private Testing testing;



}
