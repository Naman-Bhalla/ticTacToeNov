package dev.naman.strategies.winning;

import dev.naman.models.Board;
import dev.naman.models.Player;

import java.util.List;

public interface IWinningStrategy {
    Player checkWinner(Board board, List<Player> players) ;
}

// if yoyu have an interface for a service -> services
// interface for strategy -> strategy
// we will keep on playing till all the cells are filled