package com.booking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.entity.Member;
import com.booking.repository.MemberRepository;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Autowired
	public MemberRepository memberRepository;
	
	@Override
	public Member addMember(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public Member updateMember(Member member) {
		return memberRepository.save(member);
	}

	@Override
	public void deleteMember(Member member) {
		memberRepository.delete(member);
	}

	@Override
	public List<Member> getAllMember() {
		//List<Member> members = new ArrayList<Member>();
		return memberRepository.findAll();
	}

}
