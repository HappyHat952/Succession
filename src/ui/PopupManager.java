package ui;

import core.Popups;
import org.newdawn.slick.Graphics;
import ui.buttons.AddNewButton;
import ui.buttons.addNewButtons.AddNewGrass;
import ui.buttons.addNewButtons.AddNewLichen;
import ui.buttons.addNewButtons.AddNewShrub;
import ui.buttons.addNewButtons.AddNewTree;
import world.Dirt;
import world.World;

import java.util.ArrayList;

import static core.Popups.*;

public class PopupManager {
    private static ArrayList<Popup> popups;
    int X_LEFT = 1500;

    public PopupManager()
    {
        popups = new ArrayList<>();
        popups.add(Popups.POP1);

    }

    public  void render(Graphics g)
    {
        for (Popup p: popups)
        {
            p.render(g);
        }
    }

    public void update( )
    {
        for (Popup p: popups)
        {
            p.update();
        }
        if (Dirt.maxOut())
        {
            popups.add(POP6);
        }
        else if (Dirt.getLevel() >= (new AddNewTree(-5,-5)).getDirtMinimum() && POP5.isActive()) {
            popups.add(POP5);
            World.pause();
        } else if (Dirt.getLevel() >= (new AddNewShrub(-5,-5)).getDirtMinimum() && POP4.isActive()) {
            popups.add(POP4);
            World.pause();
        } else if (Dirt.getLevel() >= (new AddNewGrass(-5,-4)).getDirtMinimum() && POP3.isActive()) {
            popups.add(POP3);
            World.pause();
        }
        else if (!World.isPause() &&Dirt.getLevel() >= (new AddNewLichen(-5,-5)).getDirtMinimum() && POP2.isActive()) {
            popups.add(Popups.POP2);
            World.pause();
        }

    }

    public void mousePressed(int button, int x, int y) {
        for (Popup p: popups)
        {
            p.click(x, y);
        }
    }

}