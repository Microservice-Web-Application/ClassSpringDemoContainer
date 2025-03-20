package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        // Alien obj = new Alien();
        // obj.code();
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");// creates a container for the beans
     
        Alien obj = (Alien) context.getBean("alien");
        //Alien obj = context.getBean("alien", Alien.class);
        // creates
       // obj.code();
        // System.out.println(obj.getAge());

        // Alien obj1 = (Alien) context.getBean("alien");// creates
        // obj1.code();


    }
}