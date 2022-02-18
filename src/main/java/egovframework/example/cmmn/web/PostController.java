package egovframework.example.cmmn.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PostController {
	
	@RequestMapping(value="/postList")
	public String ShowPostList() {
		
		
		return "post/list";
	}
	
}
