package com.booking.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.booking.entity.Member;

@Component
public interface MemberService {

	public Member addMember(Member member);
	public Member updateMember(Member member);
	public void deleteMember(Member member);
	//public Member getMemberById (int idcardid);
	//public Member getMemberByAdharNo(long adharno);
	//public Member getMemberByPanNo(String panNo);
	public List<Member> getAllMember();
}
