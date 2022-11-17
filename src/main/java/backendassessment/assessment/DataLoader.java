package backendassessment.assessment;

import backendassessment.assessment.Entities.Users;
import backendassessment.assessment.Services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {


    private UsersService usersService;

    @Autowired
    public DataLoader(UsersService usersService){
        this.usersService=usersService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        usersService.createNewUser(new Users("Francisco", "Perez Sanchez","667202163", "franpersanchez@gmail.com"));
        usersService.createNewUser(new Users("Tomas", "Lageira ","6658544", "tomas.lageira@solera.com"));

    }
}
