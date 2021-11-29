package dev.naman.strategies.winning;

import dev.naman.models.Board;
import dev.naman.models.Player;

import java.util.List;

public class DefaultWinningStrategy implements IWinningStrategy {
    @Override
    public Player checkWinner(Board board, List<Player> players) {
        return null;
    }
}
