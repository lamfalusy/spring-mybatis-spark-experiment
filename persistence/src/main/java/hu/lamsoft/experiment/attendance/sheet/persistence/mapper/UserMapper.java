package hu.lamsoft.experiment.attendance.sheet.persistence.mapper;

import java.util.List;

import hu.lamsoft.experiment.attendance.sheet.persistence.model.User;

public interface UserMapper {

    public List<User> getAllUsers();

    public int insertUser(User user);

    public int updateUser(User user);
	
}
