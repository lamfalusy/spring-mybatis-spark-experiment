package hu.lamsoft.experiment.attendance.sheet.service.hello.impl;

import org.springframework.stereotype.Service;

import hu.lamsoft.experiment.attendance.sheet.service.hello.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "hello "+name;
	}

}
