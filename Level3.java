import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BrickWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    private final float GRAVITY = 0.0677f;
    private final GreenfootSound MUSIC = new GreenfootSound("incompetech_tribal.mp3");
    private final int SPEED = 4;
    private final float JUMP_FORCE = 5.6f;
    private final int MAX_HEALTH = 3;
    private final int MAX_POWERUP = 3;
    private final Class NEXT_LEVEL = WinSplash.class;
     /**
     * Constructor for objects of class BrickWorld.
     * 
     */
    public Level3()
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
        addObject(brickWall,420,597);
        SmBrickWall smBrickWall = new SmBrickWall();
        addObject(smBrickWall,413,425);
        SmBrickWall smBrickWall2 = new SmBrickWall();
        addObject(smBrickWall2,545,274);
        BrickWall brickWall2 = new BrickWall();
        addObject(brickWall2,846,112);
        brickWall.setLocation(368,624);
        smBrickWall.setLocation(413,456);
        Bomb bomb = new Bomb(GRAVITY);
        addObject(bomb,284,577);
        Bomb bomb2 = new Bomb(1);
        addObject(bomb2,506,578);
        Bomb bomb3 = new Bomb(1);
        addObject(bomb3,553,577);
        Bomb bomb4 = new Bomb(1);
        addObject(bomb4,458,575);
        bomb4.setLocation(452,578);
        bomb4.setLocation(360,416);
        bomb2.setLocation(394,409);
        bomb3.setLocation(412,404);
        SmBrickWall smBrickWall3 = new SmBrickWall();
        addObject(smBrickWall3,510,455);
        smBrickWall3.setLocation(426,442);
        SmBrickWall smBrickWall4 = new SmBrickWall();
        addObject(smBrickWall4,785,411);
        smBrickWall4.setLocation(728,416);
        Gem gem = new Gem();
        addObject(gem,756,384);
        smBrickWall.setLocation(484,459);
        bomb2.setLocation(431,432);
        bomb2.setLocation(404,428);
        removeObject(bomb3);
        removeObject(bomb2);
        removeObject(smBrickWall3);
        smBrickWall.setLocation(398,456);
    }

     private void spawn()
    {
        if(Math.random() < 0.0025)
        {
            addObject(new Rock(GRAVITY), Greenfoot.getRandomNumber(1200), -30);
        }
    }
}
