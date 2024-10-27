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
        dirtSprite = new SpriteSheet(Images.DIRT, Images.DIRT.getWidth(), level);
    }

    public void update()
    {
        dirtSprite = new SpriteSheet(Images.DIRT, Images.DIRT.getWidth(), level);
    }

    public void render(Graphics g)
    {
        g.drawImage(dirtSprite.getSubImage(0,0), 0, Main.getScreenHeight()-World.ROCK_HEIGHT-level);
    }

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
