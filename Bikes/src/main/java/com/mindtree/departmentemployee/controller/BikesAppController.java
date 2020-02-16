package com.mindtree.departmentemployee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.departmentemployee.entity.Bike;
import com.mindtree.departmentemployee.exception.ServiceException;
import com.mindtree.departmentemployee.service.BikesAppService;

@Controller
public class BikesAppController {
	
	@Autowired
	BikesAppService bikesAppSer;
	
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(path="/getBrandandDealer",  method = RequestMethod.GET)
	public String getBrandandDealer(Model model)
	{
		
		model.addAttribute("brands",bikesAppSer.getBrands());
		model.addAttribute("dealers", bikesAppSer.getDealers());
		return "brand";
	}
	
	
	@RequestMapping(path="/assignBrandToDealer",  method = RequestMethod.POST)
	public String assignBrandToDealer(@RequestParam int brandId,  @RequestParam int dealerId,Model model)
	{
		model.addAttribute("message",bikesAppSer.assignBrandToDealer(dealerId,brandId));
	
		return "brand";
	}
	
	@RequestMapping(path="/getBrands")
	public String getBrands(Model model)
	{
		model.addAttribute("brands",bikesAppSer.getBrands());
		return "bike";
	}
	
	@RequestMapping(path="/addBikeToBrand")
	public String addBikeToBrand(Model model , Bike bike,int brandId)
	{
		model.addAttribute("message",bikesAppSer.addBikeToBrand(bike,brandId));
		return "bike";
	}
	
	
	@GetMapping("/giveDealerName")
	public String index2() {
		return "get-bikes";
	}
	
	@RequestMapping(path="/getAllBikes")
	public ModelAndView getAllBikes(Model model,String dealerName) throws ServiceException
	{
		
		model.addAttribute("bikes",bikesAppSer.getBikesOfaBrand(dealerName));
		ModelAndView mv = new ModelAndView();
		mv.setViewName("get-bikes");
		return mv;
		}
	
	@RequestMapping(path ="/getTotalInvestment")
	public String getTotalInvestment(Model model){
		
		model.addAttribute("ibikes",bikesAppSer.getInvestment());
		return "investement";
		
	}
	
	
}
