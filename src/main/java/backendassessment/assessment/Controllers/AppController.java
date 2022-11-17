package backendassessment.assessment.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import backendassessment.assessment.Entities.Users;
import backendassessment.assessment.Services.UsersService;

@RestController
public class AppController {
	
	@Autowired
	private UsersService userService;
	

}
