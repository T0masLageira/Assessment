package backendassessment.assessment.Controllers;

import java.util.List;

import backendassessment.assessment.EntitiesDTO.UsersDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import backendassessment.assessment.Entities.Users;
import backendassessment.assessment.Services.UsersService;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/v1")
public class AppController {
	
	@Autowired
	private UsersService userService;

	@GetMapping(path="/get-all-users")
	public List<UsersDTO> getAllUSers(){
		return userService.getAllUsers();
	}

	@PostMapping(path="/add-new-user")
	public Users addNewUSer(
			@RequestBody Users newUSer){
		return userService.createNewUser(newUSer);
	}

	@DeleteMapping(path="delete-user/{id}")
	public String deleteUser(@PathVariable Long id){
		return userService.deleteUSer(id);

}

	
}