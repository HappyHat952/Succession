package world.entity.plant;

import core.Images;
import core.Main;
import world.Dirt;
import world.entity.Plant;

public class Lichen extends Plant {
    static public final String NAME = "lichen";
    public Lichen( )
    {
        super();
        dirtVal = 1;
        lifespan = (int)((Math.random()*10) + 5); //5 to 15;
        myImage = Images.LICHENS.get((int)(Math.random()*3));

        initialize();
    }
}
