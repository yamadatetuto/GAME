import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldStage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldStage3 extends World
{
    MASAHARU masaharu = null;

    /**
     * Constructor for objects of class WorldStage3.
     * 
     */
    public WorldStage3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        masaharu = new MASAHARU();
        addObject( masaharu, 300, 200 );
    }
    public void act()
    {
        if( masaharu.x >= 599 ){
        World game = new WorldStage4();
        Greenfoot.setWorld( game );
    }
}
}
