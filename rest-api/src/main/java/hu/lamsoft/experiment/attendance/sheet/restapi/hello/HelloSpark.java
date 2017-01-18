package hu.lamsoft.experiment.attendance.sheet.restapi.hello;

import static spark.Spark.get;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import hu.lamsoft.experiment.attendance.sheet.service.hello.HelloService;
import hu.lamsoft.experiment.attendance.sheet.spark.SparkController;

@Component
@Order(value=1)
public class HelloSpark implements SparkController {

	@Autowired
	private HelloService helloService;
	
	@Override
	public void register() {
		get("/hello", (request, response) -> helloService.hello("spark") );
	}

}
