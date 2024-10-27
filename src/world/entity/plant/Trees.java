package world.entity.plant;

import core.Images;
import world.entity.Plant;

public class Trees extends Plant {
    static public final String NAME = "trees";
    public Trees()
    {
        super();
        lifespan = (int)((Math.random()*10) + 11); //11 to 21;
        dirtVal = 4;
        myImage = Images.TREES.get((int)(Math.random()*2));



        initialize();
    }
}