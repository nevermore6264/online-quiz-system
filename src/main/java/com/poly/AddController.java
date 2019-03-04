package com.poly;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.poly.service.AddService;


@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("firstname") int i, HttpServletRequest request,@RequestParam("lastname")int j, HttpServletResponse response){
		
		AddService as = new AddService();
		int k = as.add(i, j);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
	}
	
}
