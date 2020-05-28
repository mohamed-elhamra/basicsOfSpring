package melha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("cercle")
public class Cercle {

    private Point centre;

    @Autowired
    public Cercle(@Qualifier(value = "point1") Point centre) {
        this.centre = centre;
    }

    public Point getCentre() {
        return centre;
    }

}
