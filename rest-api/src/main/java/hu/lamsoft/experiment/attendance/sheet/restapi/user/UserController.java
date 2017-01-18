package hu.lamsoft.experiment.attendance.sheet.restapi.user;

import static spark.Spark.get;
import static spark.Spark.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import hu.lamsoft.experiment.attendance.sheet.persistence.model.User;
import hu.lamsoft.experiment.attendance.sheet.service.user.UserService;
import hu.lamsoft.experiment.attendance.sheet.spark.SparkController;

@Component
@Order(value=2)
public class UserController implements SparkController {

	@Autowired
	private UserService userService;
	
	@Override
	public void register() {
		get("/users", (request, response) -> userService.getUsers() );
		post("/user", (request, response) -> userService.createUser(new User(null, request.params("firstName"), request.params("lastName"), request.params("email"))) );
	}

}
