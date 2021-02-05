/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopong;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Allan
 */

public class Player {
   
    public boolean right , left;
    public int x,y,width,height;
    
    public  Player(int x, int y){
        this.x = x;
        this.y = y;
        this.width=40;
        this.height=5;
    }
    
    public void tick(){
        /*lógica do game*/
        if(right == true){
            x++;
        }else if(left == true){
            x--;
        }
        if(x+width > Game.WIDTH){
           x = Game.WIDTH - width;
        }else if(x< 0){
            x = 0;
        }
    }
    
    public void render(Graphics g){
        /*Redenriizar o game */
        g.setColor(Color.blue);
        g.fillRect(x, y, width, height);
    }
}
