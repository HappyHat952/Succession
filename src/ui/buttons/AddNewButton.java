package ui.buttons;

import org.newdawn.slick.Color;

abstract public class AddNewButton extends Button {

    final static int WIDTH = 75;
    final static int HEIGHT = 50;
    public AddNewButton(int x, int y, String plantName)
    {
        super(x,y, WIDTH, HEIGHT, Color.green,"add "+plantName);
    }
    @Override
    public void action() {
    }
}
