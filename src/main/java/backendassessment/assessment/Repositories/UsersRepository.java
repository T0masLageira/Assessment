package backendassessment.assessment.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import backendassessment.assessment.Entities.Users;

@Repository
public interface UsersRepository extends JpaRepository <Users, Long> {

}
