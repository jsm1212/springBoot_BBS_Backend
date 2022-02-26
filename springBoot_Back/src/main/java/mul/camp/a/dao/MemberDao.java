package mul.camp.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.camp.a.dto.MemberDto;

@Mapper
@Repository
public interface MemberDao {
	
	public int getId(MemberDto dto);
	
	public int addMember(MemberDto dto);
	
	public MemberDto login(MemberDto dto);
}
