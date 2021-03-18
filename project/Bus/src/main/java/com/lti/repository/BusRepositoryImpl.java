package com.lti.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lti.entity.Bus;

@Component
public class BusRepositoryImpl implements BusRepository {
    
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public Bus addABus(Bus bus) {
		// TODO Auto-generated method stub
		Bus bus1=em.merge(bus);
		return bus1;
	}

	public Bus findBusById(long busId) {
		// TODO Auto-generated method stub
		return em.find(Bus.class, busId);
	}

	public List<Bus> searchBusesBySrcAndDest(Bus bus) {
		// TODO Auto-generated method stub
		String jpql = "from Bus b where UPPER(b.source) LIKE :src and UPPER(b.destination) LIKE :dest";
		Query query = em.createQuery(jpql);
		query.setParameter("src","%"+bus.getSource().toUpperCase()+"%");
		query.setParameter("dest", "%"+bus.getDestination().toUpperCase()+"%");
		List<Bus> buses = query.getResultList();
		return buses;
	}
	
	public List<Bus> viewAllBuses(){
		String jpql = "from Bus b";
		Query query = em.createQuery(jpql);
		List<Bus> buses = query.getResultList();
		return buses;
	}


}
