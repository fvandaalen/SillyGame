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
public class Square {
    private Position pos;
    private Piece piece;
    
    public Square(Position pos){
        this.pos = pos;
    }
    
    public Position getPosition(){
        return pos;
    }
    
    public Piece getPiece(){
        return piece;
    }
    
    public boolean Occupied(){
        return (piece != null);
    }
    
    public void Place(Piece p){
        this.piece = p;
    }
    
    public void Clear(){
        piece = null;
    }
}
