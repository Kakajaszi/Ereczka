import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ewa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ewa extends Actor
{
    int koszyczek=5;
    
    public void klawisze()
    {
        if(Greenfoot.isKeyDown ("d")) move (1);
        if(Greenfoot.isKeyDown("a")) move (-1);
        if(Greenfoot.isKeyDown("w"))
        {turn(-90);
            move(1);
            turn(90);
        }
        if(Greenfoot.isKeyDown("s") )
        {turn(-90);
            move(-1);
            turn(90);
        }
    }
    public void stawiaj()
    { if(Greenfoot.isKeyDown("space"))
        {
        if (!isTouching(Apple.class) )//    !is= nie
        {
        World swiat; //zmienna swiat typu World
        swiat = getWorld();  //Podanie siwatu
        int x,y;  //wspołrzedne
        x=getX(); //ewa daje x
        y=getY();
        if (koszyczek > 0)swiat.addObject(new Apple(),x,y );
        koszyczek--;
    }
}
    }
    public void pobierzJablka()
    {
        if(isTouching(Drzewo.class) ) koszyczek=5;
    }
   
    /**
     * Act - do whatever the Ewa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        klawisze();
        stawiaj();
        pobierzJablka();
       
    }    
}
