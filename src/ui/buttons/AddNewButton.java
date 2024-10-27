package ui.buttons;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import world.Dirt;

abstract public class AddNewButton extends Button {

    final static int WIDTH = 100;
    final static int HEIGHT = 50;
    protected int dirtMinimum;
    public AddNewButton(int x, int y, String plantName)
    {
        super(x,y, WIDTH, HEIGHT, Color.green,"add "+plantName);
    }

    public void render(Graphics g)
    {
        //checks if the limit is met
        if (!isActivated())
        {
            g.setColor(Color.lightGray);
        }
        else {
            g.setColor(color);
        }
        g.fillRect(myX,myY,width,height);
        g.setColor(Color.black);
        g.drawString(name,myX,myY);
    }

    public boolean isActivated()
    {
        //checks if the limit is met
        return Dirt.getLevel()>=dirtMinimum;
    }

    protected void action()
    {
        if (isActivated())
        {
            add();
        }
    }
    abstract protected void add();
}
