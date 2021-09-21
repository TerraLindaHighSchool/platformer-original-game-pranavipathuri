import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level1()
    {    
        // Create a new world with 1200x800 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1, false); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Door door = new Door();
        addObject(door,667,40);
        door.setLocation(677,48);
        door.setLocation(682,44);
        Player player = new Player();
        addObject(player,21,570);
        door.setLocation(640,55);
        door.setLocation(677,51);
        door.setLocation(658,24);
        door.setLocation(970,132);
        door.setLocation(1176,26);
        door.setLocation(1153,40);
        door.setLocation(1164,40);
        door.setLocation(1180,30);
        door.setLocation(1176,56);
        door.setLocation(1180,14);
        door.setLocation(1164,46);
        player.setLocation(20,661);
    }
}
