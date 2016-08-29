package vfc.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vfc.domain.Event;

@Repository
public interface EventManagementRepository extends CrudRepository<Event, Integer> {

}
