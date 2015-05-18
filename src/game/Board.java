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
public class Board {
    private Square[][] board;
    private int length, width;
    
    public Board(int length, int width){
        this.length = length;
        this.width = width;
        board = new Square[length][width];
    }
    
    public Square[][] getBoard(){
        return board; 
    }
    
    public void place(Piece piece, Position p){
        if(!Occupied(p))
        board[p.x][p.y].Place(piece);
    }
    
    public boolean Occupied(Position p){
        return board[p.x][p.y].Occupied();
    }
    
    public void Clear(Position p){
        board[p.x][p.y].Clear();
    }
    
}
