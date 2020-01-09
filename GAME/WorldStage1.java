import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldStage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldStage1 extends World
{

    /**
     * Constructor for objects of class WorldStage1.
     * 
     */
    public WorldStage1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        addObject( new block(), 100, 200 );
        addObject( new block(), 100, 230 );
        addObject( new block(), 100, 260 );
        addObject( new block(), 200, 200 );
        addObject( new block(), 230, 200 );
        addObject( new block(), 260, 200 );
    }
    public void act()
    {
        if( Greenfoot.isKeyDown( "1" ) ){
        World game = new WorldStage2();
        Greenfoot.setWorld( game );
       }
    }
}
