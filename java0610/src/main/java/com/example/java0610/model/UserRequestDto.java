package com.example.java0610.model;

import lombok.Getter;

@Getter
public class UserRequestDto {
    private String name;
    private int age;
    private int gender; // 0은 남자, 1은 여자
}
