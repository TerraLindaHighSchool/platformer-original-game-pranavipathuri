import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    private final float GRAVITY = 0.0677f;
    
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
    
    public void act()
    {
        spawn();
    }

    private void prepare()
    {
        addObject(new Player(), 47,733);

        addObject(new Floor(), 600, 800);

        addObject(new Door(),1174,40); 

        addObject(new Bomb(GRAVITY),367,665);

        addObject(new BrickWall(),876,434);
        addObject(new BrickWall(),960,101);
        addObject(new BrickWall(),400,710);

        addObject(new Gem(),738,576);

        addObject(new SmBrickWall(),463,171);
        addObject(new SmBrickWall(),608,103);
        
        addObject(new SmBrickWall(),690,608);
        addObject(new SmBrickWall(),584,528);

        
        addObject(new SmBrickWall(),657,347);
        addObject(new SmBrickWall(),548,245);
        
    }
     private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
