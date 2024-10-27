package ui.buttons;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;

abstract public class Button {
    private int myX;
    private int myY;
    private int width;
    private int height;
    private Color color;
    private String name;

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

    abstract public void action();

}
