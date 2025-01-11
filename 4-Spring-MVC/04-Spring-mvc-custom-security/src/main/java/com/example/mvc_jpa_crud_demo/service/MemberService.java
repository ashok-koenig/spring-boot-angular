package com.example.mvc_jpa_crud_demo.service;

import com.example.mvc_jpa_crud_demo.model.Member;
import com.example.mvc_jpa_crud_demo.repository.MemberRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    private MemberRepository memberRepository;
    public MemberService(MemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    public Member createMember(Member member){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        member.setPassword("{bcrypt}"+ encoder.encode(member.getPassword()));
        member.setUserRole("ROLE_ADMIN");
        member.setActive(true);
        return memberRepository.save(member);
    }
}
