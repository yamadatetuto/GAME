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
        int jflag=0;
        int y_count=0;
        int y_temp=0;
        int y_lt=0;
        int yj=0;
        int y = getY();
        int x = getX();
        
        getImage().scale( 80, 80 );
<<<<<<< HEAD
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation(x-1,y);
            move(3);
        }
        if( Greenfoot.isKeyDown( "left" ) ){   
            setLocation(x+1,y);
            move(-3);
        }
        
        
            if( Greenfoot.isKeyDown( "space" ) )
            {
                jflag = 1;
                y_lt = y;
                y -= 10;
            }
=======
>>>>>>> 2c042f70352d1a97947bc58ac613157ee68ef6fd
            if(jflag==1)
            {
                y_temp = y;
                y += (y-y_lt)+10;
                y_lt = y_temp;
                if(y==360)
                {
                    jflag = 0;
                }
            }
            if( Greenfoot.isKeyDown( "space" ) && jflag==0 )
            {
                jflag = 1;
                y_lt = y;
                y -= 10;
                setLocation(x,y);
            }
            
<<<<<<< HEAD
            
      
            
=======
        
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation(x-1,y);
            move(3);
        }
        if( Greenfoot.isKeyDown( "left" ) ){   
            setLocation(x+1,y);
            move(-3);
        }
>>>>>>> 2c042f70352d1a97947bc58ac613157ee68ef6fd
        
    }    
}
