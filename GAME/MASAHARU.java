import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.HashMap;

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
    
    public int x = 0;
    public int y = 0;
    /**
     * Act - do whatever the MASAHARU wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    HashMap<String,GreenfootImage> imgmap = new HashMap<String,GreenfootImage>();
    public MASAHARU(){
        imgmap.put("left",new GreenfootImage( "M_left.png" ));
        imgmap.put("right",new GreenfootImage( "M_right.png" ));
        imgmap.get("left").scale(80,80);
        imgmap.get("right").scale(80,80);
        setImage(imgmap.get("right")); 
    }
    public void act() 
    {
        /*
         * 最初にgitBashで共有する
         */
        
        x = getX();
        y = getY();
        
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
            setImage(imgmap.get("right")); 
            setLocation(x-1,y);
            move(3);
        }
        if( Greenfoot.isKeyDown( "left" ) ){   
            setImage(imgmap.get("left")); 
            setLocation(x+1,y);
            move(-3);
        }

        
        if(x>=599){
            getWorld().showText( "GAME OVER", 300, 150 );
        }
        
    }    
}
