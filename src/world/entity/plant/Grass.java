package world.entity.plant;

import core.Images;
import world.entity.Plant;

public class Grass extends Plant {
    static public final String NAME = "grass";
    public Grass()
    {
        super();
        lifespan = (int)((Math.random()*10) + 7); //7 to 17;
        dirtVal = 2;
        myImage = Images.GRASS;



        initialize();
    }
}