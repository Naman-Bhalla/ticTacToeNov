package dev.naman.strategies.winning;

import dev.naman.models.Board;
import dev.naman.models.Player;

import java.util.List;

public class DefaultWinningStrategy implements IWinningStrategy {
    @Override
    public Player checkWinner(Board board, List<Player> players) {
        int winningRowIndex = board.getWinningRow();
        int winningColumnIndex = board.getWinningColumn();
        if(winningRowIndex == -1 && winningColumnIndex == -1) {
           return null;
        }
        if(winningRowIndex == -1) {
            return getWinningPlayer(0, winningColumnIndex, board, players);
        }
        return getWinningPlayer(winningRowIndex, 0, board, players);
    }

    public Player getWinningPlayer(int winningCellRowIndex, int winningCellColumnIndex, Board board, List<Player> players) {
        char winningSymbol = board.getBoard()
                .get(winningCellRowIndex)
                .get(winningCellColumnIndex)
                .getSymbol()
                .getSymbol();
        Player winningPlayer = null;
        for (Player player : players) {
            if (player.getSymbol() == winningSymbol) {
                winningPlayer = player;
                break;
            }
        }
        return winningPlayer;
    }
}
