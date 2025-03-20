package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import bt.edu.gcit.config.AppConfig;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean(Alien.class);
        obj.code();


        // Desktop dt = context.getBean("comp2",Desktop.class);
        // dt.compile();

        // Desktop dt1 = context.getBean("comp2",Desktop.class);
        // dt1.compile();


    }
}