package world;

import core.Images;
import core.Main;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SpriteSheet;

import static core.Images.DIRT;

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
            if (i< DIRT.getVerticalCount()-1)
            {
                g.drawImage(DIRT.getSubImage(0, DIRT.getVerticalCount()-i), 0, Main.getScreenHeight()-World.ROCK_HEIGHT-i);
            }

        }

    }

    public static int getLevel(){return level;}

    public static int getHeight()
    {
        return Main.getScreenHeight()-World.ROCK_HEIGHT-level;
    }

    public static boolean maxOut(){ return (level) > DIRT.getVerticalCount(); }

    public static void addToLevel(int i)
    {
        if ((level += i) <= DIRT.getVerticalCount())
        {
            level += i;
        }

    }
}
