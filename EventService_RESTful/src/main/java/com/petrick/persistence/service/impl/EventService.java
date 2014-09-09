package com.petrick.persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import com.petrick.persistence.dao.IEventDAO;
import com.petrick.persistence.model.Event;
import com.petrick.persistence.service.IEventService;

@Service
@Transactional
public class EventService implements IEventService{
	
	@Autowired
	private IEventDAO dao;
	
	public IEventDAO getDao() {
        return dao;
    }
	
	@Transactional(readOnly = true)
    public Event findOne(final long id) {
        return getDao().findOne(id);
    }

    @Transactional(readOnly = true)
    public List<Event> findAll() {
        return getDao().findAll();
    }
}
