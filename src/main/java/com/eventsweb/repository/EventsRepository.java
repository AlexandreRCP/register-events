package com.eventsweb.repository;

import org.springframework.data.repository.CrudRepository;

import com.eventsweb.models.Events;

public interface EventsRepository extends CrudRepository<Events, String> {

}
