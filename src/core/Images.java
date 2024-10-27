package core;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;

import java.util.ArrayList;

public class Images {
     public static SpriteSheet DIRT;

     public static Image GRASS;
     public static Image SHRUB;

     public static ArrayList<Image> LICHENS;
     public static ArrayList<Image> TREES;

    public static void loadImages()
    {
        try
        {
            DIRT = new SpriteSheet( new Image("res/dirt.png"), 1920,1);

            LICHENS = new ArrayList<Image>();
            LICHENS.add(new Image("res/lichen_one.png"));
            LICHENS.add(new Image("res/lichen_two.png"));
            LICHENS.add(new Image("res/lichen_three.png"));
            GRASS = new Image("res/grass.png");
            SHRUB = new Image("res/shrub.png");
            TREES = new ArrayList<Image>();
            TREES.add(new Image("res/tree_small.png"));
            TREES.add(new Image("res/tree_tall.png"));
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }
}
