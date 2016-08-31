package vfc.repository;


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
 	}

