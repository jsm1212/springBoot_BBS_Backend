package mul.camp.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.camp.a.dao.MemberDao;
import mul.camp.a.dto.MemberDto;

@Service
@Transactional
public class MemberService {
	
	@Autowired
	MemberDao dao;
	
	public boolean getId(MemberDto dto) {
		int n = dao.getId(dto);
		
		return n>0?true:false;
	}
	
	public boolean addMember(MemberDto dto) {
		int n = dao.addMember(dto);
				
		return n>0?true:false;
	}
	
	public MemberDto login(MemberDto dto) {
		return dao.login(dto);
	}
	
	public boolean checkEmail(MemberDto dto) {
		int n = dao.checkEmail(dto);
		
		return n>0?true:false;
	}
	
	public List<MemberDto> allMember() {
		return dao.allMember();
	}
}
