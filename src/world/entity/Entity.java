package world.entity;

import core.Main;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;

abstract public class Entity {
    protected int lifespan;//lifespan in seconds
    protected int countDown;//lifespan in frames;
    protected int myX;
    protected int myY;
    protected Image myImage;

    public Entity(int x, int y)
    {
        myX = x;
        myY = y;
    }
    public void initialize()
    {
        //sets up the countdown
        countDown = lifespan * Main.FRAMES_PER_SECOND;
        myX -= myImage.getHeight();
    }


    public void render(Graphics g)
    {
        g.drawImage(myImage, myX,myY);
    }

    public void update()
    {
        countDown --;
    }
}
