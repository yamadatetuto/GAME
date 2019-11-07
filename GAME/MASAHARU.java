import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MASAHARU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MASAHARU extends Actor
{
    /**
     * Act - do whatever the MASAHARU wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        getImage().scale( 80, 80 );
        if( Greenfoot.isKeyDown( "right" ) ){
        //setRotation(0);
        setLocation(x-1,y);
        move(3);
        }
        if( Greenfoot.isKeyDown( "left" ) ){    
        //setRotation(270);
        setLocation(x+1,y);
        move(-3);
        }
        
    }    
}
