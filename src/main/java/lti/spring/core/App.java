package lti.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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

//		Employee emp = (Employee) context.getBean("emp");
		Employee emp = context.getBean("emp", Employee.class);

		emp.work();

		((AbstractApplicationContext) context).close();
		System.out.println("End");

	}
}


