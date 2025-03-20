package bt.edu.gcit;



public class Alien{

    private int age;
    private int salary;

    // private Laptop lap;
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