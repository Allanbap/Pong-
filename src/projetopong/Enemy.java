/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopong;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author Allan
 */
public class Enemy {
    
    public double x,y;
    public int width,height;
    
    
    public Enemy(int x, int y){
        this.x = x;
        this.y = y;
        this.width=40;
        this.height=5;
        
    }
    public  void tick(){
        x+= ( Game.ball.x - x - 6)*0.1;
        /*Rectangle rect1 = new Rectangle((int)x, (int)y, width, height);
        if(rect1){
            
        }*/
    }
    public  void render(Graphics g){
        g.setColor(Color.red);
        g.fillRect((int)x, (int)y, width, height);
    }
}
