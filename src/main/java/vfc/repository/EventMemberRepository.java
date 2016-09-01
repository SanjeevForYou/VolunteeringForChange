package vfc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vfc.domain.EventMember;

@Repository
public interface EventMemberRepository extends JpaRepository<EventMember, Integer>{

}
