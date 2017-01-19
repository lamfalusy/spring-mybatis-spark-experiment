package hu.lamsoft.experiment.attendance.sheet.restapi.user;

import static spark.Spark.get;
import static spark.Spark.post;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import hu.lamsoft.experiment.attendance.sheet.persistence.model.User;
import hu.lamsoft.experiment.attendance.sheet.service.user.UserService;
import hu.lamsoft.experiment.attendance.sheet.spark.SparkController;

@Component
@Order(value=2)
public class UserController implements SparkController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Override
	public void register() {
		get("/users", (request, response) -> userService.getUsers() );
		post("/user", (request, response) -> userService.createUser(new User(null, request.queryParams("firstName"), request.queryParams("lastName"), request.queryParams("email"))) );
	}
	
}
