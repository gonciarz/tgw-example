package pl.gpost.logo;

import pl.gpost.TurtleGraphicsWindow;

import static java.util.concurrent.TimeUnit.SECONDS;
import static pl.gpost.logo.Helper.sleep;

public class Example {

    private static TurtleGraphicsWindow turtle;

    private static void drawBox(int side) {
        for (int i = 0; i < 4; i++) {
            turtle.forward(side);
            turtle.right(90);
        }
    }

    public static void main(String[] args) {
        turtle = new TurtleGraphicsWindow(600, 600);
        turtle.hideturtle();
        drawBox(100);
        turtle.showturtle();
        sleep(1, SECONDS);
        turtle.right(45);
        turtle.forward(20);
        turtle.setpencolor(turtle.RED);
        turtle.fill();
    }

}
