package com.lti.repository;

import java.util.List;

import com.lti.entity.Bus;

public interface BusRepository {
	public Bus addABus(Bus bus);
	public Bus findBusById(long busId);
	public List<Bus> searchBusesBySrcAndDest(Bus bus);
	public List<Bus> viewAllBuses();

}
