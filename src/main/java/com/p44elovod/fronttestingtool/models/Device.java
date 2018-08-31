package com.p44elovod.fronttestingtool.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String deviceName;

    @OneToOne
    private Testing testing;
}
