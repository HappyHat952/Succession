package world.entity.plant;

import core.Images;
import world.entity.Plant;

public class Shrub extends Plant {
    static public final String NAME = "shrub";
    public Shrub()
    {
        super();
        lifespan = 9;
        dirtVal = 3;
        myImage = Images.SHRUB;

        initialize();
    }
}