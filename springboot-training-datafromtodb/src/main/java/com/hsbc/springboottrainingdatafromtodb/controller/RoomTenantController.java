package com.hsbc.springboottrainingdatafromtodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.springboottrainingdatafromtodb.dao.RoomTenantDao;
import com.hsbc.springboottrainingdatafromtodb.model.RoomTenant;

@Controller
public class RoomTenantController {
	@Autowired
	RoomTenantDao roomTenantDao;
	
	@RequestMapping("/roomtenantdetails")
	public ModelAndView getRoomTenantDetailsPage() {
		
		
		List<RoomTenant> tenantsList = roomTenantDao.findAll();
		ModelAndView mav = new ModelAndView("roomtenantdetails", "tenantsList", tenantsList);
		return mav;
	}
	
	@RequestMapping(value = "/addtenant", method =  RequestMethod.GET)
	public ModelAndView getAddTenantPage() {
		RoomTenant rt = new RoomTenant();
		ModelAndView mav = new ModelAndView("addnewtenant", "form", rt);
		return mav;
	}

	@RequestMapping(value="/addtenant", method = RequestMethod.POST)
	public String addNewTenant(RoomTenant rt) {
		roomTenantDao.save(rt);
		return "redirect:/roomtenantdetails";
	}

}
