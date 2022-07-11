package springdemo.com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeApplication {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("springdemo/beanScope-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = (theCoach == alphaCoach);

        System.out.println("\nPointint to the same object: " + result);

        System.out.println("\nMemory Location for theCoach: " + theCoach);

        System.out.println("\nMemory Location for alphaCoach: " + alphaCoach);

        context.close();
    }
}
