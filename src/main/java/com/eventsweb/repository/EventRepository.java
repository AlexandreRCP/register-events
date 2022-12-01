package com.eventsweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventsweb.models.Event;

public interface EventRepository extends CrudRepository<Event, String> {

}
