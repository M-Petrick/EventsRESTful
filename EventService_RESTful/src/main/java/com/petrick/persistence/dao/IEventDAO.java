package com.petrick.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.petrick.persistence.model.Event;

//@Repository("eventrepo") not needed Spring data jpa auto-creates implementations of the dao interface
public interface IEventDAO extends JpaRepository<Event, Long>, JpaSpecificationExecutor<Event>{

}
