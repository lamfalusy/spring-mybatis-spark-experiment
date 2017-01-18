package hu.lamsoft.experiment.attendance.sheet.spark;

import static spark.Spark.*;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SparkConfiguration {

    @Autowired(required = false)
    private List<SparkController> sparks = new ArrayList<>();

    @PostConstruct
    private void init() {
    	port(8001);
        sparks.stream().forEach( spark -> spark.register());
    }

}