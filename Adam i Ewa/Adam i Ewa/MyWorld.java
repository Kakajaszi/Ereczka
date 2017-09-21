import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000,691, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Adam adam = new Adam();
        addObject(adam,198,616);
        Ewa ewa = new Ewa();
        addObject(ewa,963,571);
        adam.setLocation(1123,655);
        ewa.setLocation(152,641);
        ewa.setLocation(143,513);
        adam.setLocation(927,541);
        Drzewo drzewo = new Drzewo();
        addObject(drzewo,830,373);
        Wc wc = new Wc();
        addObject(wc,659,263);
    }
}
