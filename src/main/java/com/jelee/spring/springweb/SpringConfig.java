package com.jelee.spring.springweb;

import com.jelee.spring.springweb.repository.MemberRepository;
import com.jelee.spring.springweb.repository.MemoryMemberRepository;
import com.jelee.spring.springweb.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }
}
