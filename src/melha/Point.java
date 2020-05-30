package melha;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("point")
public class Point {

    @Value("#{4}") //@Value uses setter-based configuration.
    private int x;
    @Value("#{point1.getX()}")
    private int y;

    public Point(int x, int y) {
        //System.out.println("inside args constructor.");
        this.x = x;
        this.y = y;
    }

    public Point(){
        //System.out.println("inside no args constructor.");
    }

    public int getX() {
        //System.out.println("Inside setter X.");
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
