package lti.spring.core;

import org.springframework.context.annotation.Bean;

public class JavaConfig {

	@Bean
	public Employee getEmployee() {
		return new Employee(103, "Tonu", 16.75);
	}

}
