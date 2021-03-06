package com.example.spring0617.dto;

import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ResponseMemberDTO {
    private String email;
    private String name;
    private int age;
    private int gender;

    @Builder
    public ResponseMemberDTO(String email, String name, int age, int gender) {
        this.email = email;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}