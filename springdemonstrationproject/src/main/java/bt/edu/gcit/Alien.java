package bt.edu.gcit;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.beans.factory.annotation.Value;


@Component
@Scope("prototype")
public class Alien{

    @Value("32")
    private int age;

    @Value("1000000")
    private int salary;

    // private Laptop lap;

    @Autowired
    @Qualifier("laptop")
    private Computer comp;
    public int getAge(){
        return age;
    }
    // public void setAge(int age){
    //     System.out.println("Set Alien called");
    //     this.age = age;
    // }

    public Alien(int age, Computer comp, int salary){
        System.out.println("Alien Object created");
        this.age = age;
        this.comp = comp;
        this.salary = salary;
    }

    public Alien(){
        System.out.println("Alien Object created");
    }

    public void code(){
        System.out.println("I am coding");
        comp.compile();
    }

    // public Laptop getLap(){
    //     return lap;
    // }

    // public void setLap(Laptop lap){
    //     System.out.println("From setLap");
    //     this.lap = lap;
    // }
    public void setComp(Computer comp){
        this.comp = comp;
    }

    public Computer getComp(){
        return comp;
    }
}