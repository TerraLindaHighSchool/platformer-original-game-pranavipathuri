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
        Floor floor = new Floor();
        addObject(new Floor(), 600, 800);
        Player player = new Player();
        addObject(new Player(),38,752);
        Door door = new Door();
        addObject(new Door(),1174,40);        
        Bomb bomb = new Bomb();
        addObject(new Bomb(),56,56);
        BrickWall brickWall = new BrickWall();
        addObject(new BrickWall(),240,600);
        addObject(new Gem(),43,33);
        addObject(new SmBrickWall(),120,34);
        addObject(new TrapDoor(),120,34);
        player.setLocation(25,759);
    }
}
