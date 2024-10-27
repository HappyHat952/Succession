package world.entity;

import core.Main;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import world.Dirt;

abstract public class Entity {
    protected int lifespan;//lifespan in seconds
    protected int countDown;//lifespan in frames;
    protected int dirtVal;
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

        //sets up the position;
        myX -= myImage.getHeight();
        myY -= myImage.getHeight();
        myY +=20;
    }


    public void render(Graphics g)
    {
        if (countDown>0)
        {
            g.drawImage(myImage, myX,myY);
        }

    }

    public void update()
    {
        if (countDown>0)
        {
            countDown --;
        }
        else if(countDown ==0) {
            Dirt.addToLevel(dirtVal);
            countDown --;
        }

    }
}
