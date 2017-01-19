package hu.lamsoft.experiment.attendance.sheet.service.user.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hu.lamsoft.experiment.attendance.sheet.persistence.mapper.UserMapper;
import hu.lamsoft.experiment.attendance.sheet.persistence.model.User;
import hu.lamsoft.experiment.attendance.sheet.service.user.UserService;

@Service
public class UserServiceImpl implements UserService {

	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User createUser(User user) {
		userMapper.insertUser(user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		return userMapper.getAllUsers();
	}

}
