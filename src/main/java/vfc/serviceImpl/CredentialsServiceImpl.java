package vfc.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vfc.domain.Credentials;
import vfc.repository.CredentialsRepository;
import vfc.service.CredentialsService;

@Service
@Transactional 
public class CredentialsServiceImpl implements CredentialsService {
	
 	@Autowired
	private CredentialsRepository credentialsRepository;


  	public void save(Credentials credentials) {

  		PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();   		
  		String encodedPassword = passwordEncoder.encode(credentials.getPassword());
  		credentials.setPassword(encodedPassword);
  		
  		credentialsRepository.save(credentials);
	}
	public List<Credentials> findAll() {
		return (List<Credentials>)credentialsRepository.findAll();
	}

 
}
