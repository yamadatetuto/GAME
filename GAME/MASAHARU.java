import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MASAHARU here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MASAHARU extends Actor
{
    public int my = 200;
    public boolean jflag = false;
    public int y_temp=0, y_prev=0;
    
    /**
     * Act - do whatever the MASAHARU wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        int x = getX();
        int y = getY();
        
        getImage().scale( 80, 80 );
        
        if(jflag==true){
            y_temp = y;
            y += (y-y_prev)+1;
            y_prev = y_temp;
            if(y>=200){
                jflag = false;
            }
        }
        
        if( Greenfoot.isKeyDown( "space" ) && jflag==false){
            jflag = true;
            y_prev = y;
            y = y-10;
        }
        
        setLocation(x,y);
            
        if( Greenfoot.isKeyDown( "right" ) ){
            setLocation(x-1,y);
            move(3);
        }
        if( Greenfoot.isKeyDown( "left" ) ){   
            setLocation(x+1,y);
            move(-3);
        }

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
            
            Actor block;
            block = getOneObjectAtOffset(0, 0, block.class);
            if (block != null){

                World world;

                world = getWorld();

                world.removeObject(block);
            }
}
            
        


        
    }    
