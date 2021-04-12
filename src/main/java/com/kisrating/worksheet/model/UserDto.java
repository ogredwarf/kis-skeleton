package com.kisrating.worksheet.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
public class UserDto {

    String userMgmtId;
    String employeeNo;
    String username;
    String userDepartmentCd;
    LocalDate joinedDate;
    LocalDate retirementDate;
}
