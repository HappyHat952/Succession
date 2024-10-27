package core;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.util.ArrayList;

public class Images {
     public static SpriteSheet DIRT;

     public static SpriteSheet LICHEN;
     public static Image GRASS;
     public static Image SHRUB;

     public static ArrayList<Image> LICHENS;

    public static void loadImages()
    {
        try
        {
            DIRT = new SpriteSheet( new Image("res/dirt.png"), 1920,1);

            LICHENS = new ArrayList<Image>();
            LICHENS.add(new Image("res/lichen_one.png"));
            LICHENS.add(new Image("res/lichen_two.png"));
            LICHENS.add(new Image("res/lichen_three.png"));
            LICHEN = new SpriteSheet(new Image("res/lichen.png"),93,85 );
            GRASS = new Image("res/grass.png");
            SHRUB = new Image("res/shrub.png");
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}
