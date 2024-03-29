package mul.camp.a.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mul.camp.a.dto.BbsDto;
import mul.camp.a.dto.BbsParam;
import mul.camp.a.service.BbsService;

@RestController
public class BbsController {
	
	@Autowired
	BbsService service;
	
	@RequestMapping(value = "/getBbsList", method = { RequestMethod.GET, RequestMethod.POST })
	public List<BbsDto> getBbsList(){
		System.out.println("BbsController getBbsList() " + new Date());
		
		List<BbsDto> list = service.getBbsList();
		return list;
	}
	
	@RequestMapping(value = "/writeBbs", method = { RequestMethod.GET, RequestMethod.POST })
	public String writeBbs(BbsDto dto){
		System.out.println("BbsController writeBbs() " + new Date());
		
		boolean b = service.writeBbs(dto);
		
		if(b) {
			return "OK";
		}
		
		return "NO";
	}
	
	
	@RequestMapping(value = "/getBbs", method = { RequestMethod.GET, RequestMethod.POST })
	public BbsDto getBbs(int seq) {
		System.out.println("BbsController getBbs() " + new Date());
		
		BbsDto dto = service.getBbs(seq);
		
		return dto;
	}
	
	@RequestMapping(value = "/bbsdetail", method = {RequestMethod.GET, RequestMethod.POST} )
	public BbsDto bbsdetail(int seq) {
		System.out.println("BbsController BbsDto " + new Date());
		
		service.readcount(seq);		
		return service.getBbs(seq);
	}
	
	@RequestMapping(value = "/getBbsListSearch", method = { RequestMethod.GET, RequestMethod.POST })
	public List<BbsDto> getBbsListSearch(BbsParam param){
		System.out.println("BbsController getBbsListSearch() " + new Date());
		
		return service.getBbsListSearch(param);
	}
	
	@RequestMapping(value = "/getBbsListSearchPage", method = { RequestMethod.GET, RequestMethod.POST })
	public List<BbsDto> getBbsListSearchPage(BbsParam param){
		System.out.println("BbsController getBbsListSearchPage() " + new Date());
		
		// 페이지 설정
		int sn = param.getPage(); // 0 1 2 3 ~
		int start = sn * 10 + 1; // 1 11
		int end = (sn + 1) * 10; // 10 20
		
		param.setStart(start);
		param.setEnd(end);
		
		
		return service.getBbsListSearchPage(param);
		
		
	}
	
	@RequestMapping(value = "/getBbsCount", method = {RequestMethod.GET, RequestMethod.POST} )
	public int getBbsCount(BbsParam param) {
		System.out.println("BbsController getBbsCount " + new Date());
		return service.getBbsCount(param);
	}
	
	
	@RequestMapping(value = "/answer", method = {RequestMethod.GET, RequestMethod.POST} )
	public String answer(BbsDto dto) {
		System.out.println("BbsController answer " + new Date());
		System.out.println("dto:" + dto.toString());
		
		boolean b = service.reply(dto);
		
		if(b) { 
			return "OK"; 
		}		 
		return "NO";
	}
	@RequestMapping(value = "/updateBbs", method = {RequestMethod.GET, RequestMethod.POST} )
	public String updateBbs(BbsDto dto) {
		System.out.println("BbsController updateBbs " + new Date());
		
		boolean b = service.updateBbs(dto);
		
		if(b) {
			return "y";
		}
		return "n";
	}
	
	
	@RequestMapping(value = "/deleteBbs", method = {RequestMethod.GET, RequestMethod.POST} )
	public String deleteBbs(int seq) {
		System.out.println("BbsController deleteBbs " + new Date());
		
		boolean b = service.deleteBbs(seq);
		
		if(b) {
			return "y";
		}
		return "n";
	}
	
	// 모바일
	
	@RequestMapping(value = "/writeBbs_M", method = { RequestMethod.GET, RequestMethod.POST })
	public String writeBbs_M(@RequestBody BbsDto dto){
		System.out.println("BbsController writeBbs_M() " + new Date());
		
		boolean b = service.writeBbs(dto);
		
		if(b) {
			return "OK";
		}
		
		return "NO";
	}
	
	@RequestMapping(value = "/updateBbs_M", method = {RequestMethod.GET, RequestMethod.POST} )
	public String updateBbs_M(@RequestBody BbsDto dto) {
		System.out.println("BbsController updateBbs_M" + new Date());
		
		boolean b = service.updateBbs(dto);
		
		if(b) {
			return "y";
		}
		return "n";
	}
	
}
