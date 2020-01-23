import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldStage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldStage2 extends World
{
    MASAHARU masaharu = null;

    /**
     * Constructor for objects of class WorldStage2.
     * 
     */
    public WorldStage2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        masaharu = new MASAHARU();
        addObject( masaharu, 70, 50 );
    }
    public void act()
    {
        if( Greenfoot.isKeyDown( "2" ) ){
        World game = new WorldStage3();
        Greenfoot.setWorld( game );
    }
        
    }
}
