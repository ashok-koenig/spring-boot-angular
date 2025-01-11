package com.example.mvc_jpa_crud_demo.repository;

import com.example.mvc_jpa_crud_demo.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Integer> {
}
