package com.kisrating.worksheet.common;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("unchecked")
public class Response<T> {
    private String status;
    private String description;
    @Builder.Default
    private String message = "";
    private T body;
    @Builder.Default
    private LocalDateTime transactionTime = LocalDateTime.now();

    public static <T> Response<T> ok(){
        return (Response<T>) Response.builder()
                .status("ok").description("성공")
                .build();
    }

    public static <T> Response<T> ok(@NonNull T body ){
        return (Response<T>) Response.builder()
                .status("ok").description("성공")
                .body(body)
                .build();
    }

    public static <T> Response<T> ok(@NonNull T body , @NonNull final String message ){
        return (Response<T>) Response.builder()
                .status("ok").description("성공")
                .message(message)
                .body(body)
                .build();
    }

    public static <T> Response<T> fail(){
        return (Response<T>) Response.builder()
                .status("fail").description("실패")
                .build();
    }

    public static <T> Response<T> fail(@NonNull final String message){
        return (Response<T>) Response.builder()
                .status("fail").description("실패")
                .message(message)
                .build();
    }
}
