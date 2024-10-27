package world;

import core.Main;
import org.newdawn.slick.*;
import world.entity.Entity;
import world.entity.Plant;

import java.util.ArrayList;

public class World {
    private static GameContainer gc;
    private static Dirt dirt;
    public static final int ROCK_HEIGHT = Main.getScreenHeight()/4;
    private static ArrayList<Plant> plants;

    private static boolean pause;

    public World(GameContainer gc) {
        this.gc = gc;
        dirt = new Dirt();
        plants = new ArrayList<Plant>();
    }

    public void render(Graphics g)
    {
        g.setBackground(Color.cyan);
        //draws a rectangle for the rock
        g.setColor(Color.lightGray);
        g.fillRect(0, Main.getScreenHeight()- ROCK_HEIGHT, Main.getScreenWidth(), ROCK_HEIGHT);
        dirt.render(g);
        for (Plant p: plants)
        {
            p.render(g);
        }

    }
    public void update()
    {
        if (!pause)
        {
            dirt.update();
        }
        for (Plant p: plants)
        {
            p.update();
        }
    }

    public void pause() {pause = true;}
    public void unpause() {pause = false;}


    public void mousePressed(int button, int x, int y) {

    }

    public static void addPlant(Plant plant)
    {
        if (plant != null)
        {
            plants.add(plant);
        }
    }
}
