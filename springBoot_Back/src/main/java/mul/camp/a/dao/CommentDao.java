package mul.camp.a.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import mul.camp.a.dto.CommentDto;

@Mapper
@Repository
public interface CommentDao {
	
	public int insertComment(CommentDto dto);
	
	public List<CommentDto> getCommentList(int seq);
	
}
