package ui.buttons;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

abstract public class Button {
    protected int myX;
    protected int myY;
    protected int width;
    protected int height;
    protected Color color;
    protected String name;

     public Button(int x, int y, int width, int height, Color color, String name)
    {
        myX= x;
        myY = y;
        this.width = width;
        this.height = height;
        this.color = color;
        this.name = name;
    }

     public boolean mouseOver(int x, int y){
        return (x>myX && y>myY && x<(myX+width) && y <(myY+height));
    }

    public void render(Graphics g)
    {
        g.setColor(color);
        g.fillRect(myX,myY,width,height);
        g.setColor(Color.black);
        g.drawString(name,myX,myY);
    }
    public void update(){}
    public void click(int x, int y)
    {
        if (mouseOver(x,y))
        {
            action();
        }
    }

    abstract protected void action();

}
