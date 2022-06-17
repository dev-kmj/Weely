package com.example.spring0617.repository;

import com.example.spring0617.entity.Gender;
import com.example.spring0617.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    List<Member> findAllByMyServiceAgeEqualsAndMyServiceGenderNot(int myServiceAge, Gender myServiceGender);
    List<Member> findEmail(String email);
}