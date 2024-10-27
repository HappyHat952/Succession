package core;

import ui.Popup;

import java.io.File;

import java.io.FileNotFoundException;

import java.util.Scanner;

public class Popups {

    public static Popup POP1;//welcome popup
    public static Popup POP2;//lichen popup
    public static Popup POP3;//grass popup
    public static Popup POP4;//shrub popup
    public static Popup POP5;// tree popup
    public static Popup POP6;


    static public void loadPopups()
    {
        POP1 = loadPopup(1);
        POP2 = loadPopup(2);
        POP3 = loadPopup(3);
        POP4 = loadPopup(4);
        POP5 = loadPopup(5);
        POP6 = loadPopup(6);


    }


    static public Popup loadPopup(int num) {
        try {

            File text = new File("res/text/popup"+num);

            Scanner scan = new Scanner(text);


            // Loop through all the lines
            String title = scan.nextLine();
            String message = "";
            int i=0;

            //for (int i = 1; i < text.size()-1; i++)
            while (scan.hasNextLine()){
                System.out.println(i);
                i++;
                String row = scan.nextLine();
                message = message +"\n"+ row;
            }
            scan.close();

            return new Popup(title, message);


        }
            catch (FileNotFoundException e) {

            System.out.println("Cannot find file!");

        }
        return new Popup();

    }
}


