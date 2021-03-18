package com.lti.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.entity.Bus;
import com.lti.service.BusService;

@RestController
@RequestMapping("/bus")
public class BusResource {
	@Autowired
	BusService busService;
	
	
	@RequestMapping(value = "/addBus", method = RequestMethod.POST)
    public Bus addABus(@RequestBody Bus bus) {
		Bus b=busService.addABus(bus);
		return b;
	}
	
	@GetMapping(value = "/findBusById")
	public Bus findBusById(@RequestParam("busId") long busId) {
		return busService.findBusById(busId);
	}
	
	@RequestMapping(value="/searchBuses", method = RequestMethod.POST)
	public List<Bus> viewAllBuses(@RequestBody Bus bus) {
		return busService.searchBusesBySrcAndDest(bus);
	}
	
	@RequestMapping("/viewAllBuses")
	public List<Bus> viewAllBuses() {
		return busService.viewAllBuses();
	}
}
