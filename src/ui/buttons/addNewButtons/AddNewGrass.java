package ui.buttons.addNewButtons;

import ui.buttons.AddNewButton;
import world.World;
import world.entity.plant.Grass;
import world.entity.plant.Lichen;

public class AddNewGrass extends AddNewButton {
        public AddNewGrass(int x, int y) {
            super(x, y, Grass.NAME);
            dirtMinimum = 30;
        }
    protected void add() {
        World.addPlant(new Grass());
    }
}
