package com.ships.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ships.model.Ship;
import com.ships.services.ShippingService;

@Controller

public class ShipController {
	
	@Autowired
	private ShippingService shipService;
	
	@RequestMapping(value = "/showShips", method = RequestMethod.GET)
	
	public String getShips(Model s)
		{
			ArrayList<Ship> shipList = shipService.listAll();
			
			s.addAttribute("shipList", shipList);
		
			return "showShips";
		}

}
