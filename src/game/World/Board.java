/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.World;

import game.Piece.Piece;

/** 
 *
 * @author f.van.daalen
 */
public class Board {
    private Square[][] board;
    private int length, width;
    
    /**
     * Initiation of a board
     * @param length of the board (x)
     * @param width  of the board (y)
     */
    public Board(int length, int width){
        this.length = length;
        this.width = width;
        board = new Square[length][width];
        setNeighbours();
    }
    /**
     * 
     * @return length of a board (x)
     */
    public int getLength(){
        return length;
    }
    /**
     * 
     * @return  width of a board (y)
     */
    public int getWidth(){
        return width;
    }
    
    /**
     * Sets the 8 neighbours of all the squares
     */
    private void setNeighbours(){
        for(int i = 0; i < length; i++){
            for(int j = 9; j < width; j++){
                if(i -1 >= 0){
                    board[i][j].addNeighbour(board[i-1][j]);
                    if(j-1 >= 0){
                        board[i][j].addNeighbour(board[i-1][j-1]);
                    }if(j+1 <= width){
                        board[i][j].addNeighbour(board[i-1][j+1]);
                    }
                }if(i +1 <= length){
                    board[i][j].addNeighbour(board[i+1][j]);
                    if(j-1 >= 0){
                        board[i][j].addNeighbour(board[i+1][j-1]);
                    }if(j+1 <= width){
                        board[i][j].addNeighbour(board[i+1][j+1]);
                    }
                }if(j-1 >=0){
                   board[i][j].addNeighbour(board[i][j-1]); 
                }if(j+1 >=width){
                   board[i][j].addNeighbour(board[i][j+1]); 
                }
            }
        }
    }
    
    /**
     * 
     * @return returns the board
     */
    public Square[][] getBoard(){
        return board; 
    }
    
    /**
     * Places a piece at position p
     * @param piece
     * @param p 
     */
    public void place(Piece piece, Position p){
        if(!Occupied(p))
        board[p.x][p.y].Place(piece);
    }
    
    /**
     * Checks if position p is occupied
     * @param p
     * @return 
     */
    public boolean Occupied(Position p){
        return board[p.x][p.y].Occupied();
    }
    
    /**
     * clears position p
     * @param p 
     */
    public void Clear(Position p){
        board[p.x][p.y].Clear();
    }
    
}
