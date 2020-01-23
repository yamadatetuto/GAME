import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldStage4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldStage4 extends World
{
    MASAHARU masaharu = null;

    /**
     * Constructor for objects of class WorldStage4.
     * 
     */
    public WorldStage4()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject( new block(), 100, 200 );

        
        masaharu = new MASAHARU();
        addObject( masaharu, 300, 200 );
        
    }
    
    public void act()
    {
<<<<<<< HEAD
        showText( "my="+masaharu.my, 100, 100 );

=======
>>>>>>> 5c3a28e9010a81f5c67708086e648a01c23bdbe0
    }
}
