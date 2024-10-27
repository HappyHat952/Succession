package ui.buttons.addNewButtons;

import ui.buttons.AddNewButton;
import world.World;
import world.entity.plant.Shrub;

public class AddNewShrub extends AddNewButton {
    public AddNewShrub(int x, int y)
    {
        super(x, y, Shrub.NAME);
        dirtMinimum = 60;

    }
    protected void add() {World.addPlant(new Shrub());}
}
