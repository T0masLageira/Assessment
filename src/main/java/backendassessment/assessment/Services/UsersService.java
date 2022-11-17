package backendassessment.assessment.Services;

import backendassessment.assessment.Converters.UsersConverter;
import backendassessment.assessment.Entities.Users;
import backendassessment.assessment.EntitiesDTO.UsersDTO;
import backendassessment.assessment.Repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
	
	 @Autowired
	 private UsersRepository usersRepository;

	 @Autowired
	 private UsersConverter converter;

	 
	 public Users createNewUser(Users newUser) {
	 	 return usersRepository.save(newUser);
	    }


	    //for security reasons, UsersDTO is used, to show data without ID
	public List<UsersDTO> getAllUsers() {
		List<Users> usersList =usersRepository.findAll();
		List<UsersDTO> usersDTOList = new ArrayList<>();
		for (Users user : usersList){
			UsersDTO dto = converter.ModelToDto(user);
			dto.setId(user.getId());
			dto.setName(user.getName());
			dto.setSurName(user.getSurName());
			dto.setPhoneNumber(user.getPhoneNumber());
			dto.setEmail(user.getEmail());
			usersDTOList.add(dto);
		}
		return usersDTOList;
	}

	public String deleteUSer(Long id) {
	 	Users userToDelete = usersRepository.findById(id).orElse(null);


		try {
			 usersRepository.delete(userToDelete);
			 return "User deleted";
		}
		catch (DataIntegrityViolationException exception){
			exception.getMessage();
			return "This user does not exist";
		}
	}



}
