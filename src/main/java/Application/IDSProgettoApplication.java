package Application;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IDSProgettoApplication{
    public static void main(String[] args) throws JsonProcessingException {
        SpringApplication.run(IDSProgettoApplication.class, args);
    }
}
//usare annotazioni che sono forniti da JPA è sono annotazioni che servono per creare un data base;
