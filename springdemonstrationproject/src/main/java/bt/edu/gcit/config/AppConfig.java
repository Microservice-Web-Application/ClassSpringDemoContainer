package bt.edu.gcit.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import bt.edu.gcit.Desktop;
import org.springframework.context.annotation.Scope;

import bt.edu.gcit.Alien;
import bt.edu.gcit.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import bt.edu.gcit.Laptop;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan("bt.edu.gcit")
public class AppConfig{

    // @Bean(name="comp2")
    // //@Scope("prototype")
    // public Desktop desktop(){
    //     return new Desktop();
    // }

    // @Bean
    // public Alien alien( @Qualifier("comp2") @Autowired Computer comp){
    //     // return new Alien();

    //     Alien obj =new Alien();
    //     obj.setComp(comp);
    //     return obj;
    // }

    // @Bean
    // @Primary
    // public Laptop laptop(){
    //     return new Laptop();
    // }

}