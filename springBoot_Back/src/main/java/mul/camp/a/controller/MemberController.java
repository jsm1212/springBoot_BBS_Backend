package mul.camp.a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;


@RestController
public class MemberController {
	
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/getId", method = {RequestMethod.GET, RequestMethod.POST})
	public String getId(MemberDto dto) {
		System.out.println("MemberController getId");
		
		boolean b = service.getId(dto);
		
		if(b) {
			return "NO";
		}
		return "OK";
	}
	
	@RequestMapping(value = "/addMember", method = { RequestMethod.GET, RequestMethod.POST })
	public String addMember(MemberDto dto) {
		System.out.println("MemberController addMember");
		
		boolean b = service.addMember(dto);
		
		if(b) {
			return "YES";
		}
		return "NO";
	}
	
	@RequestMapping(value = "/login", method = { RequestMethod.GET, RequestMethod.POST })
	public MemberDto login(MemberDto dto) {
		System.out.println("MemberController login");
		
		MemberDto mem = service.login(dto);
		return mem;
	}

}
