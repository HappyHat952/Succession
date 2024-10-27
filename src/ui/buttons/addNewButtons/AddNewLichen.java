package ui.buttons.addNewButtons;

import ui.buttons.AddNewButton;
import world.World;
import world.entity.plant.Grass;
import world.entity.plant.Lichen;

public class AddNewLichen extends AddNewButton {
    public AddNewLichen(int x, int y) {
        super(x, y, Lichen.NAME);
        dirtMinimum = 0;
    }
    protected void add() {
        World.addPlant(new Lichen());
    }
}
