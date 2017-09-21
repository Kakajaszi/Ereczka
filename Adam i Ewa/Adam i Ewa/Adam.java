import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Adam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Adam extends Actor
{
    int koszyczek=0;
    public void zjadaj()
    {
        if(isTouching (Apple.class) )

            if (koszyczek<5 )
            {
                removeTouching(Apple.class);
                koszyczek++;
            }

    }

    public void klawisze()
    {
        if(Greenfoot.isKeyDown ("right")) move (1);
        if(Greenfoot.isKeyDown("left")) move (-1);
        if(Greenfoot.isKeyDown("up"))
        {turn(-90);
            move(1);
            turn(90);
        }

        if(Greenfoot.isKeyDown("down") )
        {turn(-90);
            move(-1);
            turn(90);
        }
    }

    public void sraj()
    {
        if(isTouching(Wc.class) ) koszyczek=0;
    }


    /**
     * Act - do whatever the Adam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        klawisze();
        zjadaj();
        sraj();

    }    
}
