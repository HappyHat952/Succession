package ui;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import ui.buttons.PopupButton;
import world.World;

public class Popup {
    private PopupButton myButton;
    private String title;
    private String message;

    private boolean active;

    public Popup(String title, String message)
    {
        this.title = title;
        this.message = message;
        myButton = new PopupButton(440,240);
        World.pause();
        active = true;
    }

    public Popup()
    {
        title = "test";
        message = "tester\nererererer";

        myButton = new PopupButton(440,240);
        World.pause();
        active = true;
    }

    public void render(Graphics g) {
        if (active)
        {
            g.setColor(Color.white);
            g.fillRect(40,40,500,300);
            g.setColor(Color.black);
            g.drawString(title,40,40);
            g.setColor(Color.darkGray);
            g.drawString(message, 40,70);
            myButton.render(g);
        }

    }

    public void update() {
    }

    public void click(int x, int y) {
        if (myButton.mouseOver(x,y))
        {
            active = false;
            World.unpause();
        }
    }

    public boolean isActive()
    {
        return active;
    }
}
