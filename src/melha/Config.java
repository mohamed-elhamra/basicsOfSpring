package melha;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"melha"})
public class Config {

    @Bean(name = "point1")
    public Point getPoint(){
        return new Point(10,10);
    }

}
