package mul.camp.a.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mul.camp.a.dao.CommentDao;
import mul.camp.a.dto.CommentDto;


@Service
@Transactional
public class CommentService {
	
	@Autowired
	CommentDao dao;
	
	public boolean insertComment(CommentDto dto) {
		return dao.insertComment(dto)>0?true:false;
	}
	
	public List<CommentDto> getCommentList(int seq) {
		return dao.getCommentList(seq);
	}
}
