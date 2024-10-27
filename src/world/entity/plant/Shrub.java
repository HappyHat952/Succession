package world.entity.plant;

import core.Images;
import world.entity.Plant;

public class Shrub extends Plant {
    static public final String NAME = "shrub";
    public Shrub()
    {
        super();
        lifespan = (int)((Math.random()*10) + 9); //9 to 19;
        dirtVal = 3;
        myImage = Images.SHRUB;

        initialize();
    }
}