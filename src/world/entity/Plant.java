package world.entity;

import core.Main;
import world.Dirt;

public class Plant extends Entity{
    public Plant() {
        super(0, 0);
        myX = (int)(Main.getScreenWidth()*Math.random());
        myY = Dirt.getHeight();
    }
}
