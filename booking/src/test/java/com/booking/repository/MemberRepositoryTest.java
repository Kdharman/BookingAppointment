package com.booking.repository;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.booking.entity.Member;

@SpringBootTest
class MemberRepositoryTest {

	@Autowired
	private MemberRepository memberRepository;
	
	@Test
	public void addMember() {
		Member member = new Member(10, true, true, LocalDate.of(2021, 6, 14), LocalDate.of(2021, 11, 20));
		memberRepository.save(member);
	}
}
