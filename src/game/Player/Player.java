/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.Player;

/**
 *
 * @author f.van.daalen
 */
public class Player {
    private String name;
    
    /**
     * initializes a player
     * @param name 
     */
    public Player(String name){
        this.name = name;
    }
    
    /**
     * returns the name of the player
     * @return 
     */
    public String getName(){
        return name;
    }
}
