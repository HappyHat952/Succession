package world.entity.plant;

import core.Images;
import world.entity.Plant;

public class Trees extends Plant {
    static public final String NAME = "trees";
    public Trees()
    {
        super();
        lifespan = 11;
        dirtVal = 4;
        myImage = Images.TREES.get((int) Math.random()*2);



        initialize();
    }
}