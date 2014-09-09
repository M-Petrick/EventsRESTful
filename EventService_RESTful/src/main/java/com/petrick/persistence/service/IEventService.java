package com.petrick.persistence.service;

import java.util.List;

import com.petrick.persistence.model.Event;

public interface IEventService {
	
	public Event findOne(final long id);
	public List<Event> findAll();
}
