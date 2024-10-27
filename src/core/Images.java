package core;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

public class Images {
     public static Image DIRT;


     public static SpriteSheet LICHEN;
     public static Image GRASS;

    public static void loadImages()
    {
        try
        {
            DIRT = new Image("res/dirt.png");
            LICHEN = new SpriteSheet(new Image("res/lichen.png"),93,85 );
            GRASS = new Image("res/grass.png");
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}
