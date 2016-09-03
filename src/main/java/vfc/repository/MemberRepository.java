package vfc.repository;


import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vfc.domain.Member;


	@Repository
	public interface MemberRepository extends  CrudRepository<Member, String> 
	{
		public Member findByMemberNumber(int memberNumber);
		
		@Query("select m from MEMBER m join m.credentials c where c.username = :username")
		public Member findMemberByUsername(@Param("username") String username);
		
		
		@Query("select m from MEMBER m join m.listOfEventMembers e where e.event.eventId =:eventId")
		public List<Member> findMembersByEventId(@Param("eventId") int eventId);
		

 	}

