package com.p44elovod.fronttestingtool.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class UserCommand {
    private Long id;

    private String userName;
    private String persEmail;
    private String workEmail;
    private LocalDate birthDate;
    private String cellPhone;


}
