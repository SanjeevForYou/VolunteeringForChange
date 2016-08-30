package vfc.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vfc.domain.Credentials;

	@Repository
	public interface CredentialsRepository extends  CrudRepository<Credentials, String> 
	{
  	}

