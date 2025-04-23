package Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.UserDetails;

@Repository
public interface UserRepo extends JpaRepository<UserDetails, Integer>{

}
