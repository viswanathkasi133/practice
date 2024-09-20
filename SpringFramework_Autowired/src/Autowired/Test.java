package Autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("bean.xml");
		A a = c.getBean(A.class);
		a.diplay();
	}
	
}
