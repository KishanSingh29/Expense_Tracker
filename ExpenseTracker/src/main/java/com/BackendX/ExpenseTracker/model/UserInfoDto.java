package com.BackendX.ExpenseTracker.model;

import com.BackendX.ExpenseTracker.entities.UserInfo;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoDto {

    private String username;
    private String password;

    private String firstName;
    private String lastName;
    private Long phoneNumber;

    private String email;




}
