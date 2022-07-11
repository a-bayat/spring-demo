package springdemo;

import springdemo.com.luv2code.springdemo.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring configuration
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemo/applicationContext.xml");

        // retrieve bean from spring container
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call method on bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        System.out.println(theCoach.getEmailAddress());
        System.out.println(theCoach.getTeam());

        // close the container
        context.close();
    }
}
