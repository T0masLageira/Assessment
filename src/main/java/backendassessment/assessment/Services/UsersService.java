package backendassessment.assessment.Services;

import backendassessment.assessment.Converters.UsersConverter;
import backendassessment.assessment.Entities.Users;
import backendassessment.assessment.EntitiesDTO.UsersDTO;
import backendassessment.assessment.Repositories.UsersRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsersService {
	
	 @Autowired
	 private UsersRepository usersRepository;

	 @Autowired
	 private UsersConverter converter;

	 
	 public Users createNewUser(Users newUser) {
	 	 return usersRepository.save(newUser);
	    }


	    //for security reasons, USersDTO is used, to show data without ID
	public List<UsersDTO> getAllUsers() {
		List<Users> usersList =usersRepository.findAll();
		List<UsersDTO> usersDTOList = new ArrayList<>();
		for (Users user : usersList){
			UsersDTO dto = converter.ModelToDto(user);
			dto.setName(user.getName());
			dto.setSurName(user.getSurName());
			dto.setPhoneNumber(user.getPhoneNumber());
			dto.setEmail(user.getEmail());
			usersDTOList.add(dto);
		}
		return usersDTOList;
	}
}
