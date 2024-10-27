package ui;


import core.Main;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import world.Dirt;
import world.entity.Plant;

import java.util.ArrayList;

public class UI {
    private static boolean pause;
    private static AddNewButtonManager addNewManager;
    private static GameContainer gc;

    public void pause() {pause = true;}
    public void unpause() {pause = false;}

    public UI(GameContainer gc) {
        this.gc = gc;

        addNewManager = new AddNewButtonManager();
    }

    public void render(Graphics g)
    {
        addNewManager.render(g);
    }

    public void update()
    {
        addNewManager.update();

    }
    public void mousePressed(int button, int x, int y) {
        addNewManager.mousePressed(button, x,y);
    }
}
