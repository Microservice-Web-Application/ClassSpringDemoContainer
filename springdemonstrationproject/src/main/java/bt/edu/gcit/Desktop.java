package bt.edu.gcit;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary
public class Desktop implements Computer{

    public Desktop(){
        System.out.println("Desktop Object Created");
    }

    public void compile(){
        System.out.println("Compiling from Desktop class");
    }
}