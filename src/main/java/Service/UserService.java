package Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.UserDetails;
import Repository.UserRepo;


@Service
public class UserService {
@Autowired
UserRepo ur;
	public List<UserDetails> getUserdetails() {
		// TODO Auto-generated method stub
		
		return ur.findAll();
	}
	public void datauser(UserDetails u) {
		// TODO Auto-generated method stub
	   ur.save(u);
		
	}

}