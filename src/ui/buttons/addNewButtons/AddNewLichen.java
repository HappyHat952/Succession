package ui.buttons.addNewButtons;

import ui.buttons.AddNewButton;
import world.World;
import world.entity.plant.Lichen;

public class AddNewLichen extends AddNewButton {
    public AddNewLichen(int x, int y) {
        super(x, y, "lichen");
    }
    public void action()
    {
        World.addPlant(new Lichen());
    }
}
