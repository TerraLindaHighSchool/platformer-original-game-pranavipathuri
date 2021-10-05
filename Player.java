import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @Pranavi Pathuri 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private Health[] health;
    private Powerup[] powerup;
    private int healthCount;
    private int speed;
    private int walkIndex;
    private int frame;
    private float yVelocity;
    private boolean isWalking;
    private boolean isJUmping;
    private boolean isFacingLeft;
    private GreenfootImage[] WALK_ANIMATION;
    private GreenfootImage STANDING_IMAGE;
    private float JUMP_FORCE;
    private float GRAVITY;
    private Class NEXT_LEVEL;
    private GreenfootSound MUSIC;
    
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
