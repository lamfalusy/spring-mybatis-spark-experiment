package hu.lamsoft.experiment.attendance.sheet.service.user;

import java.util.List;

import hu.lamsoft.experiment.attendance.sheet.persistence.model.User;

public interface UserService {

	User createUser(User user);
	
	List<User> getUsers();
	
}
