/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.Piece.Piece;
import game.Player.Player;
import game.World.Board;
import game.World.Position;
import game.World.Square;

/**
 *
 * @author f.van.daalen
 */
public class ThreeInARow {
    private Board board;
    private int currentPlayer;
    private Player[] players;
    private int size;
    
    /**
     * initializes a x in a row game
     * @param size of the board
     * @param contestants number of players
     * @param size of the board
     */
    public ThreeInARow(int size, int contestants){
        board = new Board(size, size);
        players = new Player[contestants];
        for(int i = 0; i < contestants; i++){
            players[i] = new Player(Integer.toString(i));
        }
        currentPlayer = 0;
        this.size = size;
    }
    
    /**
     * places a piece for player p at position pos
     * @param pos
     * @param p 
     */
    public void move(Position pos, Player p){
        if(moveIsValid(pos)){
            board.place(new Piece(p), pos);
        }
        if(won()){
            endGame();
        }else{
        endTurn();
        }
    }
    
    /**
     * checks if a move at position p is valid
     * @param p
     * @return 
     */
    private boolean moveIsValid(Position p){
        return board.Occupied(p);
    }
    
    /**
     * ends the turn changing the current player to the next
     */
    private void endTurn(){
        if(currentPlayer < players.length-1){
            currentPlayer++;
        }else{
            currentPlayer = 0;
        }
    }
    
    /**
     * checks the wincondition
     * @return 
     */
    private boolean won(){
        for(int i = 0; i < size; i++){
            if(checkRow(i)){
                return true;
            }
            if(checkCollumn(i)){
                return true;
            }
        }
        if(checkDiagonalLeft()){
            return true;
        }
        if(checkDiagonalRight()){
            return true;
        }
        return false;
    }
    /**
     * checks the diagonal going from top left to bottom right for a win
     * @return 
     */
    private boolean checkDiagonalRight(){
        for(int x = 0; x < size; x++){
            for(int y = 0; y < size; y++){
               if(!board.getBoard()[x][y].getPiece().getPlayer().getName().equals(Integer.toString(currentPlayer))){
                    return false;
                }  
            }
        }
        return true;
    }
    /**
     * checks the diagonal going from bottom left to top right for a win
     * @return 
     */
    private boolean checkDiagonalLeft(){
        for(int x = size-1; x >= 0; x--){
            for(int y = size-1; y >=0; y--){
               if(!board.getBoard()[x][y].getPiece().getPlayer().getName().equals(Integer.toString(currentPlayer))){
                    return false;
                }  
            }
        }
        return true;
    }
    
    /**
     * checks a row for a win
     * @return 
     */
    private boolean checkRow(int y){
        for(int x = 0; x < size; x++){
            if(!board.getBoard()[x][y].getPiece().getPlayer().getName().equals(Integer.toString(currentPlayer))){
                return false;
            }
        }
        return true;
    }
    
    /**
     * checks a collumn for a win
     * @return 
     */
    private boolean checkCollumn(int x){
        for(int y = 0; y < size; y++){
            if(!board.getBoard()[x][y].getPiece().getPlayer().getName().equals(Integer.toString(currentPlayer))){
                return false;
            }
        }
        return true;
    }
    
    /**
     * ends the game
     */
    private void endGame(){
        System.out.println("Player " + players[currentPlayer].getName() + " wins!");
    }
}
