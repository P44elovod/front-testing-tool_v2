package com.p44elovod.fronttestingtool.models;


import lombok.Data;
import javax.persistence.*;
import java.time.LocalDate;


@Data
@Entity
public class Testing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToOne(cascade = CascadeType.ALL)
    private Device device;

    private String note;
    private LocalDate date;

    public void setUser(User user) {
        this.user = user;
        user.setTesting(this);
    }

    public void setDevice(Device device) {
        this.device = device;
        device.setTesting(this);
    }

    public Testing(User user, Device device) {
        this.user = user;
        this.device = device;
    }
}
