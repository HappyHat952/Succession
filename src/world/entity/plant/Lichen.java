package world.entity.plant;

import core.Images;
import core.Main;
import world.Dirt;
import world.entity.Plant;

public class Lichen extends Plant {
    public Lichen( )
    {
        super();

        myImage = Images.LICHEN.getSubImage((int)(Math.random()*3),0);

        initialize();
    }
}
