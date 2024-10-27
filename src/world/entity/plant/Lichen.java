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
        lifespan = 5;
        myImage = Images.LICHEN.getSubImage((int)(Math.random()*3),0);

        initialize();
    }
}
