package com.example.java0610.controller;

import com.example.java0610.model.User;
import com.example.java0610.model.UserRepository;
import com.example.java0610.model.UserRequestDto;
import com.example.java0610.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserRepository userRepository;
    private final UserService userService;

    // 유저 생성
    @PostMapping("/api/create")
    public User createUser(@RequestBody UserRequestDto requestDto) {
        User user = new User(requestDto);
        return userRepository.save(user);
    }

    //  유저 검색
    @GetMapping("/api/read/{id}")
    public List<User> readUser() {
        return userRepository.findAll();
    }

    // 유저 정보 업데이트
    @PutMapping("/api/update/{id}")
    public Long updateUser(@PathVariable Long id, @RequestBody UserRequestDto requestDto) {
        userService.update(id, requestDto);
        return id;
    }

    // 유저 정보 삭제
    @DeleteMapping("/api/delete/{id}")
    public Long deleteUser(@PathVariable Long id) {
        userRepository.deleteById(id);
        return id;
    }

    // 유저 추천
//    @GetMapping("api/recommend/{id}")
//    public List<User> recommendUser(@PathVariable Long id) {
//        List<User> reco = userRepository.findByAge();
//    }
}
