package lti.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App3 {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(App3.class);

		Employee obj5 = context.getBean(Employee.class);
		
		System.out.println(obj5.toString());

	}

}
