package world.entity;

import core.Main;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import ui.buttons.addNewButtons.AddNewTree;
import world.Dirt;
import world.World;
import world.entity.plant.Grass;
import world.entity.plant.Lichen;
import world.entity.plant.Shrub;
import world.entity.plant.Trees;

import ui.PopupManager;

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

    public boolean isDead()
    {
        return (countDown ==-1) && !PopupManager.getSuccessionStatus();
    }

    public void update()
    {
        if (countDown>0)
        {
            countDown --;
        }
        else if(countDown ==0 && !Dirt.maxOut()) {
            Dirt.addToLevel(dirtVal);
            countDown --;
        }
        else if (countDown == 0 && Dirt.maxOut())
        {
            int i = (int)(Math.random()*1000);
            switch (i){
                case 0:
                    World.addPlant(new Lichen());
                case 1:
                    World.addPlant(new Grass());
                case 2:
                    World.addPlant(new Shrub());
                case 3:
                    World.addPlant(new Trees());
            }
            countDown--;
        }
    }
}
