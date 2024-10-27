package ui;

import org.newdawn.slick.Graphics;
import ui.buttons.AddNewButton;
import ui.buttons.addNewButtons.AddNewLichen;

import java.util.ArrayList;

public class AddNewButtonManager {
    private static ArrayList<AddNewButton> buttons;
    int X_LEFT = 1500;

    public AddNewButtonManager()
    {
        buttons = new ArrayList<>();
        buttons.add(new AddNewLichen(X_LEFT, 100));

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
