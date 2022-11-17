package backendassessment.assessment.Converters;

import backendassessment.assessment.Entities.Users;
import backendassessment.assessment.EntitiesDTO.UsersDTO;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;

@Service
public class UsersConverter implements DtoMapper<Users, UsersDTO> {
    @Override
    public UsersDTO ModelToDto(Users model) {
        return new UsersDTO(model.getName(),model.getSurName(),model.getPhoneNumber(),model.getEmail());
    }

    @Override
    public Users DtoToModel(UsersDTO dto) {
        return new Users( dto.getName(), dto.getSurName(),dto.getPhoneNumber(),dto.getEmail());
    }
}
