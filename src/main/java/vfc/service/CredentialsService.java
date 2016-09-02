package vfc.service;

import java.util.List;

import vfc.domain.Credentials;
 
public interface CredentialsService {

	public void save(Credentials credentials);
	public List<Credentials> findAll();
 }
