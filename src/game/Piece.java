/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author f.van.daalen
 */
public class Piece {
    private String name;
    private Player player; 
    private Position pos;
    
    public String getName(){
        return name;
    }
    
    public Player getPlayer(){
        return player;
    }
    
    public Position getPosition(){
        return pos;
    }
    
    public void setPosition(Position pos){
        this.pos = pos;
    }
}
