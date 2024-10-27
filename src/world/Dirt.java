package world;

import core.Images;
import core.Main;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SpriteSheet;

public class Dirt {
    private static int level;
    private static int height;
    private static SpriteSheet dirtSprite;

    public Dirt()
    {
        level = 1;
    }

    public void update()
    {
    }

    public void render(Graphics g)
    {
        for (int i=1; i<=level; i++)
        {
            g.drawImage(Images.DIRT.getSubImage(0,Images.DIRT.getVerticalCount()-i), 0, Main.getScreenHeight()-World.ROCK_HEIGHT-i);
        }

    }

    public static int getLevel(){return level;}

    public static int getHeight()
    {
        return Main.getScreenHeight()-World.ROCK_HEIGHT-level;
    }

    public static void addToLevel(int i)
    {
        if ((level += i) <= Main.getScreenHeight()/3)
        {
            level += i;
        }

    }
}
