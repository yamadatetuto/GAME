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
    }
    public void act()
    {
        if( Greenfoot.isKeyDown( "1" ) ){
        World game = new WorldStage2();
        Greenfoot.setWorld( game );
       }
    }
}