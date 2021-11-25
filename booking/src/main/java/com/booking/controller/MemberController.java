package com.booking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.Member;
import com.booking.service.MemberService;

@RestController
@RequestMapping(value = "/member")
public class MemberController {

	@Autowired
	private MemberService memberService;
	
	@PostMapping("/add")
	public Member addMember(@RequestBody Member member) {
		return memberService.addMember(member);
	}
	
	@PutMapping("/update")
	public Member updateMember(@RequestBody Member member) {
		return memberService.updateMember(member);
	}
	
	@DeleteMapping("/delete")
	public void deleteMember(@RequestBody Member member) {
		memberService.deleteMember(member);
	}
	
	@GetMapping("/allmembers")
	public List<Member> getAllMember() {
		return memberService.getAllMember();
	}
}
