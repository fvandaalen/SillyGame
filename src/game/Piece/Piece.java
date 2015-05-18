/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.Piece;

import game.Player.Player;
import game.World.Position;

/**
 *
 * @author f.van.daalen
 */
public class Piece {
    private String name;
    private Player player; 
    private Position pos;
    
    /**
     * initializes a piece
     * @param p 
     */
    public Piece(Player p){
        this.player = p;
    }
    
    /**
     * Returns the name of the piece
     * @return 
     */
    public String getName(){
        return name;
    }
    
    /**
     * returns the player owning the piece
     * @return 
     */
    public Player getPlayer(){
        return player;
    }
    
    /**
     * returns the  postion of the piece
     * @return 
     */
    public Position getPosition(){
        return pos;
    }
    
    /**
     * sets the position of the piece to position pos
     * @param pos 
     */
    public void setPosition(Position pos){
        this.pos = pos;
    }
}
