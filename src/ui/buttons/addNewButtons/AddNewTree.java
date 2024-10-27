package ui.buttons.addNewButtons;

import ui.buttons.AddNewButton;
import world.World;
import world.entity.plant.Trees;

public class AddNewTree extends AddNewButton{

    public AddNewTree(int x, int y)
    {
        super(x, y, Trees.NAME);
        dirtMinimum = 200;
    }
    protected void add(){World.addPlant(new Trees());}
    public int getDirtMinimum(){ return dirtMinimum;}
}
