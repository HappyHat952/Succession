package ui.buttons.addNewButtons;

import ui.buttons.AddNewButton;
import world.World;
import world.entity.plant.Trees;

public class AddNewTree extends AddNewButton{

    public AddNewTree(int x, int y)
    {
        super(x, y, Trees.NAME);
        dirtMinimum = 90;
    }
    protected void add(){World.addPlant(new Trees());}
}
