package ui;

import org.newdawn.slick.Graphics;
import ui.buttons.AddNewButton;
import ui.buttons.addNewButtons.AddNewGrass;
import ui.buttons.addNewButtons.AddNewLichen;
import ui.buttons.addNewButtons.AddNewShrub;
import ui.buttons.addNewButtons.AddNewTree;

import java.util.ArrayList;

public class AddNewButtonManager {
    private static ArrayList<AddNewButton> buttons;
    int Y_LEFT = 100;

    public AddNewButtonManager()
    {
        buttons = new ArrayList<>();
        buttons.add(new AddNewLichen(1000, Y_LEFT));
        buttons.add(new AddNewGrass(1200, Y_LEFT));
        buttons.add(new AddNewShrub(1400, Y_LEFT));
        buttons.add(new AddNewTree(1600, Y_LEFT));

    }

    public  void render(Graphics g)
    {
        for (AddNewButton b: buttons)
        {
            b.render(g);
        }
    }

    public void update( )
    {
        for (AddNewButton b: buttons)
        {
            b.update();
        }
    }

    public void mousePressed(int button, int x, int y) {
        for (AddNewButton b: buttons)
        {
            b.click(x, y);
        }
    }

}
