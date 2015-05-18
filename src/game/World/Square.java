/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.World;

import game.Piece.Piece;
import java.util.ArrayList;

/**
 *
 * @author f.van.daalen
 */
public class Square {
    private Position pos;
    private Piece piece;
    private ArrayList<Square> neighbours = new ArrayList<Square>();
    
    /**
     * initializes a square on the board at position pos
     * @param pos 
     */
    public Square(Position pos){
        this.pos = pos;
    }
    
    /**
     * returns the position of a square on the board
     * @return 
     */
    public Position getPosition(){
        return pos;
    }
    
    /**
     * returns the piece occupying this square if any
     * @return 
     */
    public Piece getPiece(){
        return piece;
    }
    
    /**
     * returns true if this square is occupied
     * @return 
     */
    public boolean Occupied(){
        return (piece != null);
    }
    
    /**
     * places a piece on this square
     * @param p 
     */
    public void Place(Piece p){
        this.piece = p;
    }
    
    /**
     * clears this square
     */
    public void Clear(){
        piece = null;
    }
    
    /**
     * adds a neighbour square sq to this square
     * @param sq 
     */
    public void addNeighbour(Square sq){
        neighbours.add(sq);
    }
    
    /***
     * returns the neighbour squares of this square
     * @return 
     */
    public ArrayList<Square> getNeighbours(){
        return neighbours;
    }
}
