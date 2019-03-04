package com.poly;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.poly.Bean.ProfileBean;
import com.poly.Bean.UserBean;
import com.poly.service.ProfileService;

@Controller
public class MyProfileController {

	@RequestMapping(value = "/myprofile")
	public ModelAndView createQuestion( HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, SQLException, IOException{
		
		 UserBean bean;
		// bean.getUsername();
		 String username = (String)request.getSession().getAttribute("currentSessionUsername");

		 ProfileService profile = new ProfileService();
		 ProfileBean pbean = profile.myProfile(username);
		 ModelAndView mv = new ModelAndView();
		 mv.addObject(pbean);
	     mv.setViewName("displayprofile.jsp");
         return mv;
	}
	
	
}
