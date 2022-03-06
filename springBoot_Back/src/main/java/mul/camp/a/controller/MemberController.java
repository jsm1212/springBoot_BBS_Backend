package mul.camp.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.MemberDto;
import mul.camp.a.service.MemberService;


@RestController
public class MemberController {
	
	@Autowired
	MemberService service;
	
	// 웹
	
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
	
	@RequestMapping(value = "/allMember", method = { RequestMethod.GET, RequestMethod.POST })
	public List<MemberDto> allMember() {
		System.out.println("MemberController allMember");
		
		List<MemberDto> list = service.allMember();
		return list;
	}
	
	// 모바일
	
	@RequestMapping(value = "/getId_M", method = {RequestMethod.GET, RequestMethod.POST})
	public String getId_M(@RequestBody MemberDto dto) {
		System.out.println("MemberController getId_M");
		
		boolean b = service.getId(dto);
		
		if(b) {
			return "NO";
		}
		return "OK";
	}
	

	
	@RequestMapping(value = "/addMember_M", method = { RequestMethod.GET, RequestMethod.POST })
	public String addMember_M(@RequestBody MemberDto dto) {
		System.out.println("MemberController addMember_M");
		
		boolean b = service.addMember(dto);
		
		if(b) {
			return "YES";
		}
		return "NO";
	}
	
	
	@RequestMapping(value = "/login_M", method = { RequestMethod.GET, RequestMethod.POST })
	public MemberDto login_M(@RequestBody MemberDto dto) {
		System.out.println("MemberController login_M");
		
		MemberDto mem = service.login(dto);
		return mem;
	}
	
	@RequestMapping(value= "checkEmail", method = { RequestMethod.GET, RequestMethod.POST })
	public String checkEmail(@RequestBody MemberDto dto) {
		System.out.println("MemberController checkEmail");
		
		boolean b = service.checkEmail(dto);
		
		if(b) {
			return "NO";
		}
		return "OK";
		
	}

	

}
