package core;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;
import ui.UI;
import world.Dirt;
import world.World;

public class Game extends BasicGameState
{	
	private int id;
	private World world;
	private UI ui;

	public Game(int id)
	{
		this.id = id;
	}
	
	public int getID() 
	{
		return id;		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a game state for the *first time.*
		gc.setShowFPS(true);
		Images.loadImages();
		world = new World(gc);
		ui = new UI(gc);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException
	{	
		// This updates your game's logic every frame.  NO DRAWING.
		world.update();
		ui.update();
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		// This code renders shapes and images every frame.
		world.render(g);
		ui.render(g);

	}
	
	public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		// This code happens when you enter a gameState.  
	}

	public void leave(GameContainer gc, StateBasedGame sbg) 
	{
		// This code happens when you leave a gameState. 
	}

	public void keyPressed(int key, char c)
	{
		// This code happens every time the user presses a key
	}
	
	public void mousePressed(int button, int x, int y)
	{
		ui.mousePressed(button,x,y);
		// This code happens every time the user presses the mouse
	}
	
	


}
