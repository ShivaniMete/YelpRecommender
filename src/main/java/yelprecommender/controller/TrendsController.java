package yelprecommender.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import yelprecommender.DAO.TrendsDAO;
import yelprecommender.model.Trends;

@Controller
public class TrendsController {
	
	@RequestMapping("/getTrend")
	public ModelAndView getTrend(@ModelAttribute Trends trends, HttpServletRequest request){
		System.out.println("Yay!!");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		TrendsDAO trendsDao = ctx.getBean("trendsDAO", TrendsDAO.class);
		System.out.println(trends.getCity() + " " + trends.getZip());
		Trends currentTrend = trendsDao.getTrend(trends.getCity(), trends.getZip());
		System.out.println(currentTrend.getTrendingBusiness() + " " + currentTrend.getTrendingCategory());
		ModelAndView mv = new ModelAndView("main");
		mv.addObject("trends", currentTrend);
		return mv;
	}

}
