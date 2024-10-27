package ui.buttons;

import org.newdawn.slick.Color;
import world.Dirt;

public class PopupButton extends Button {
    final static int WIDTH = 75;
    final static int HEIGHT = 50;
    public PopupButton(int x, int y)
    {
        super(x,y, WIDTH, HEIGHT, Color.blue,"Continue");
    }
    @Override
    public void action() {
        //Dirt.addToLevel(3);

    }
}
