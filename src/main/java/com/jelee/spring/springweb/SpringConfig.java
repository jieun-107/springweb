package com.jelee.spring.springweb;

import com.jelee.spring.springweb.repository.JpaMemberRepository;
import com.jelee.spring.springweb.repository.MemberRepository;
import com.jelee.spring.springweb.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class SpringConfig {

    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em) {
        this.em = em;
    }

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        // return new MemoryMemberRepository();
        // return new JdbcMemberRepository(dataSource);
        // return new JdbcMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }
}
