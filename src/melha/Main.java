package melha;

import melha.Cercle;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import java.beans.Expression;

public class Main {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);

        Cercle cercle = applicationContext.getBean("cercle",Cercle.class);

        System.out.println(cercle.getCentre().getY());

        Point point = applicationContext.getBean("point",Point.class);

        System.out.println(point.getY());
        
    }
}
