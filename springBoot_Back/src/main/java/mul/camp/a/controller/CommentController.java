package mul.camp.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.CommentDto;
import mul.camp.a.service.CommentService;

@RestController
public class CommentController {
	
	@Autowired
	CommentService service;
	
	@RequestMapping(value = "/insertComment", method = { RequestMethod.GET, RequestMethod.POST })
	public String insertComment(CommentDto dto) {
		System.out.println("BbsController insertComment() " + new Date());
		
		boolean b = service.insertComment(dto);
		
		if(b) {
			return "y";
		}
		return "n";
	}
	
	
	@RequestMapping(value = "/getCommentList", method = { RequestMethod.GET, RequestMethod.POST })
	public List<CommentDto> getCommentList(int seq){
		System.out.println("BbsController getCommentList() " + new Date());
		
		List<CommentDto> list = service.getCommentList(seq);
		return list;
	}
	
	// 모바일
	
	@RequestMapping(value = "/insertComment_M", method = { RequestMethod.GET, RequestMethod.POST })
	public String insertComment_M(@RequestBody CommentDto dto) {
		System.out.println("BbsController insertComment_M() " + new Date());
		
		boolean b = service.insertComment(dto);
		
		if(b) {
			return "y";
		}
		return "n";
	}
}
