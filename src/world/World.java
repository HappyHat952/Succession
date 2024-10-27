package world;

import core.Main;
import org.newdawn.slick.*;
import world.entity.Entity;
import world.entity.Plant;
import world.entity.plant.Grass;
import world.entity.plant.Lichen;
import world.entity.plant.Shrub;
import world.entity.plant.Trees;

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
        for (int i =plants.size()-1;i>=0; i--)
        {
            if(plants.get(i) instanceof Grass)
            {
                plants.get(i).render(g);
            }
        }
        for (int i =plants.size()-1;i>=0; i--)
        {
            if(plants.get(i) instanceof Trees)
            {
                plants.get(i).render(g);
            }
        }
        for (int i =plants.size()-1;i>=0; i--)
        {
            if(plants.get(i) instanceof Shrub)
            {
                plants.get(i).render(g);
            }
        }
        for (int i =plants.size()-1;i>=0; i--)
        {
            if(plants.get(i) instanceof Lichen)
            {
                plants.get(i).render(g);
            }
        }

    }
    public void update()
    {
        if (!pause)
        {
            dirt.update();
        }
        for (int i = 0; i<plants.size(); i++)
        {
            plants.get(i).update();

        }
        for (int i = 0; i<plants.size(); i++)
        {
            if (Dirt.maxOut() && plants.get(i).isDead())
            {
                plants.remove(i);
                i--;
            }

        }

    }

    public static boolean isPause(){ return pause;}
    public static void pause() {pause = true;}
    public static void unpause() {pause = false;}


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
