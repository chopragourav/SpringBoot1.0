package com.verusys.gourav.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.verusys.gourav.service.IWishMessageService;

@Controller
public class WishMesageController {
	@Autowired
	private IWishMessageService service;

	@RequestMapping("/")
	public String showHome() {
		return "home";
	}

	/*@RequestMapping("/wish")//wish is request path
	public ModelAndView generateMessage() {
		String result=service.getWishMessage();
		ModelAndView mav=new ModelAndView();
		mav.addObject("wMsg", result);//wMsg Model Attribute name
		mav.setViewName("display");
		return mav;
		return new ModelAndView("display", "wMsg", result);
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(BindingAwareModelMap map) {
		String result=service.getWishMessage();
		map.addAttribute("wMsg", result);
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(ModelMap map) {
		String result=service.getWishMessage();
		map.addAttribute("wMsg", result);
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(HashMap<String, Object> map) {
		System.out.println("Shared Memory Object class"+map.getClass());
		String result=service.getWishMessage();
		map.put("wMsg", result);
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(Map<String, Object> map) {
		System.out.println("Shared Memory Object class"+map.getClass().getName());
		String result=service.getWishMessage();
		map.put("wMsg", result);
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public String generateMessage(Model model) {
		System.out.println("Shared Memory Object class"+model.getClass().getName());
		String result=service.getWishMessage();
		model.addAttribute("wMsg", result);
		return "display";
	}*/
	
	/*@RequestMapping("/wish")
	public void generateMessage(Model model) {
		System.out.println("Shared Memory Object class"+model.getClass().getName());
		String result=service.getWishMessage();
		model.addAttribute("wMsg", result);*/
	
	/*@RequestMapping("/wish")
	public Model generateMessage() {
		String result=service.getWishMessage();
		Model model=new ExtendedModelMap();
		model.addAttribute("wMsg", result);
		return model;
	}*/
	
	/*@RequestMapping("/wish")
	public Map<String,Object> generateMessage() {
		String result=service.getWishMessage();
		Map<String,Object> map=new HashMap();
		map.put("wMsg", result);
		return map;
	}*/
	
	/*@RequestMapping("/wish")
	public void generateMessage(HttpServletResponse res)throws Exception {
		String result=service.getWishMessage();
		PrintWriter pw=res.getWriter();
		pw.println("<h1 style='color: red;text-align: center'>Result Page(Directly Response)</h1>");
		pw.println("<h1 style='color: GREY;text-align: center'>Wish Message is :"+result+"</h1>");
		return;*/
	
	@RequestMapping("/wish")
	public String generateMessage(HttpServletResponse res)throws Exception {
		String result=service.getWishMessage();
		PrintWriter pw=res.getWriter();
		pw.println("<h1 style='color: red;text-align: center'>Result Page(Directly Response)</h1>");
		pw.println("<h1 style='color: GREY;text-align: center'>Wish Message is :"+result+"</h1>");
		pw.println("<a href='./'>Home</a>");
		return null;
		
	}
}
