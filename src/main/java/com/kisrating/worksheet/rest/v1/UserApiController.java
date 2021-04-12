package com.kisrating.worksheet.rest.v1;

import com.kisrating.worksheet.common.Response;
import com.kisrating.worksheet.model.UserDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@Slf4j
@RestController
public class UserApiController {

    @GetMapping("/v1/user/{userMgmtId}")
    public Response<UserDto> findUser(@PathVariable String userMgmtId){
        log.debug("userMgmtId: {}", userMgmtId);
        return Response.ok( UserDto.builder()
                .userMgmtId(userMgmtId)
                .username("홍길동")
                .employeeNo("200206")
                .userDepartmentCd("D001")
                .joinedDate(LocalDate.of(2021, 1, 2))
                .build() );
    }
}
