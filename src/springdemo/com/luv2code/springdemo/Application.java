package springdemo.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemo/applicationContext.xml");

        Coach coach = context.getBean("myCoach", Coach.class);


        System.out.println(coach.getDailyWorkout());

        System.out.println(coach.getDailyFortune());

        context.close();

    }
}
