package spring_application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CoachRunner {

	public static void main(String[] args) {
		
		//Create container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoachConfiguration.class);
		
		//Load beans to the container
		Coach soccerCoach = context.getBean("soccerCoach", Coach.class);
		
		//Do something with the beans
		System.out.println(soccerCoach.getWorkout());	
	}

}
