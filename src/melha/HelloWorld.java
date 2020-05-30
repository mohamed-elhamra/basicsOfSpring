package melha;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("helloWorld")
public class HelloWorld {

    @Value("Hello World!")
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
    }

}
