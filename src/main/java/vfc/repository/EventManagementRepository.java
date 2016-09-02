package vfc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vfc.domain.Event;

@Repository
public interface EventManagementRepository extends JpaRepository<Event, Integer> {
	
	@Query("select e from Event e where e.category.categoryId=:categoryId")
	public List<Event> getEventsByCategory(@Param("categoryId") int categoryId);
}
