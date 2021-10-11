import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    public Player(int speed, float jumpForce, float gravity, int maxHealth, int maxPowerUp, Class nextLevel, GreenfootSound music)
    {
        this.speed = speed;
        JUMP_FORCE = jumpForce;
        GRAVITY = gravity;
        NEXT_LEVEL = nextLevel;
        MUSIC = music;
        
        STANDING_IMAGE = getImage();
        WALK_ANIMATION = new GreenfootImage[]
                    {
                        new GreenfootImage("walk0.png"),
                        new GreenfootImage("walk1.png"),
                        new GreenfootImage("walk2.png"),
                        new GreenfootImage("walk3.png"),
                        new GreenfootImage("walk4.png"),
                        new GreenfootImage("walk5.png"),
                        
                    };
    }
    
    public void act()
    {   
        animator();
        move(speed);
    }
    
    public void addedToWorld(World world) {}
    
    private void animator()
    {
        if(frame % (15 - 2 * speed) == 0)
        {
          if(walkIndex < WALK_ANIMATION.length)
          {
              setImage(WALK_ANIMATION[walkIndex]);
              walkIndex++;
          }
          else
          {
              walkIndex = 0;
          }
        }
        frame++;
    }
    
    private void walk() {}
    private void jump() {}
    private void fall() {}
    private void onCollision() {}
    private void mirrorImages() {}
    private void gameOver() {}
    private boolean isOnGround()
    {
        return false;
    }
}