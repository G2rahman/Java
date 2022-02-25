package Dependencyinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	
	public static void main(String [] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		Chips c1= context.getBean(Chips.class);
		Pizza p1= context.getBean(Pizza.class);
		Junkfood junkfood1= context.getBean(Junkfood.class);
		Junkfood junkfood2= context.getBean(Junkfood.class);
		junkfood1.setFbrand("Dominos");
		junkfood1.setFunit("pie");
		junkfood1.setPrice(10);
		junkfood2.setFbrand("Pizzahut");
		junkfood2.setFunit("pie");
		junkfood2.setPrice(1);
		c1.setJunkfood(junkfood1);
		p1.setJunkfood(junkfood2);
		c1.getJunkfood().display();
		p1.junkfoodinfo();
		
	}
}