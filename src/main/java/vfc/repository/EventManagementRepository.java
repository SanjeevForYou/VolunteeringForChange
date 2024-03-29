package vfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vfc.domain.Event;

@Repository
public interface EventManagementRepository extends JpaRepository<Event, Integer> {
	
}
