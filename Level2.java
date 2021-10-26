import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    private final float GRAVITY = 0.0677f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 4;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = Level3.class;
     /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level2()
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
        setPaintOrder(Player.class, Platform.class, Obstacle.class, Collectable.class,
            Door.class, HUD.class);

        Player player = new Player(SPEED, JUMP_FORCE, GRAVITY, 
                MAX_HEALTH, MAX_POWERUP, NEXT_LEVEL, MUSIC);

        addObject(player,47,733);
        addObject(new Floor(), 600, 800);
        addObject(new Door(),1174,40); 
        BrickWall brickWall = new BrickWall();
        addObject(brickWall,844,88);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,545,216);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,400,344);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,228,525);
        smBrickWall3.setLocation(345,719);
        smBrickWall3.setLocation(913,704);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,337,560);
        smBrickWall3.setLocation(772,684);
        brickWall2.setLocation(284,539);
        Bomb bomb = new Bomb(GRAVITY);
        addObject(bomb,244,495);
        Bomb bomb2 = new Bomb(GRAVITY);
        addObject(bomb2,563,172);
        bomb2.setLocation(561,182);
        bomb2.setLocation(814,60);
        Bomb bomb3 = new Bomb(GRAVITY);
        addObject(bomb3,287,495);
        Bomb bomb4 = new Bomb(GRAVITY);
        addObject(bomb4,196,492);
        Bomb bomb5 = new Bomb(GRAVITY);
        addObject(bomb5,757,42);
        bomb5.setLocation(762,56);
        Gem gem = new Gem();
        addObject(gem,645,415);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,645,449);
        SmBrickWall smBrickWall5 = new SmBrickWall();
        addObject(smBrickWall5,896,552);
        smBrickWall5.setLocation(626,638);
        brickWall2.setLocation(385,536);
        smBrickWall5.setLocation(99,634);
        smBrickWall5.setLocation(144,631);
    }

     private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
