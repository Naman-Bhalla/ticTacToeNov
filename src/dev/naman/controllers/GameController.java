package dev.naman.controllers;

import dev.naman.models.Board;
import dev.naman.models.Game;
import dev.naman.models.Move;
import dev.naman.models.Player;

import java.util.List;
import java.util.Scanner;

public class GameController {

    public static void run(Game game) {
        Board board = game.getBoard();
        int totalMoves = board.getRows()*board.getColumns();
        int moves = 0;
        List<Player> players = game.getPlayers();
        while(moves<totalMoves) {
            game.printBoard();
            System.out.println("---------------------------------");
            Player currentPlayer = players.get(moves%players.size());
            Move move = currentPlayer.makeMove(board);
            game.updateBoard(move);
            moves++;
            Player winnerPlayer = game.checkWinner();
            if(winnerPlayer != null) {
                System.out.println("Winner with symbol "+winnerPlayer.getSymbol()+" wins!!!");
                break;
            }
        }
    }
}
