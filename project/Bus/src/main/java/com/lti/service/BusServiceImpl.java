package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.entity.Bus;
import com.lti.repository.BusRepository;

@Service
public class BusServiceImpl implements BusService {
	
	@Autowired
	BusRepository busRepository;

	@Override
	public Bus addABus(Bus bus) {
		// TODO Auto-generated method stub
		return busRepository.addABus(bus);
	}

	@Override
	public Bus findBusById(long busId) {
		// TODO Auto-generated method stub
		return busRepository.findBusById(busId);
	}

	@Override
	public List<Bus> searchBusesBySrcAndDest(Bus bus) {
		// TODO Auto-generated method stub
		return busRepository.searchBusesBySrcAndDest(bus);
	}
	
	public List<Bus> viewAllBuses(){
		return busRepository.viewAllBuses();
	}
}
