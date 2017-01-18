package hu.lamsoft.experiment.attendance.sheet;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("hu.lamsoft.experiment.attendance.sheet")
public class Application {
    
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class)) {
			
		}
		
	}

}
