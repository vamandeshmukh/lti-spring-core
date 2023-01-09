package lti.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vaman
 *
 */

public class App {

	public static void main(String[] args) {

		System.out.println("Start");

//		Employee emp = new Employee();
		
//		emp.work();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp = context.getBean(Employee.class);

		emp.work();

		System.out.println("End");

	}
}
