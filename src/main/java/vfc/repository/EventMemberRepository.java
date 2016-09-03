package vfc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vfc.domain.EventMember;

@Repository
public interface EventMemberRepository extends JpaRepository<EventMember, Integer>{

	@Query("select em from EventMember em where em.event.eventId=:eventid and em.member.id=:userid")
	public List<EventMember> isUserEventExist(@Param("eventid") int eventid, @Param("userid") int userid);
	
	@Query("select em from EventMember em where em.event.eventId=:eventid and em.member.id=:userid")
	public EventMember getEventMemberByEventUserID(@Param("eventid") int eventid, @Param("userid") int userid);
}
