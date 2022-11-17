package backendassessment.assessment.Services;

import backendassessment.assessment.Entities.Users;
import backendassessment.assessment.Repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {
	
	 @Autowired
	 private UsersRepository usersRepository;
	 
	 public Users createNewUser(Users newUser) {
	        return usersRepository.save(newUser);
	    }
}
