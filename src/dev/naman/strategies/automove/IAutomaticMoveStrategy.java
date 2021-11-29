package dev.naman.strategies.automove;

import dev.naman.models.Board;
import dev.naman.models.Move;

public interface IAutomaticMoveStrategy {

    Move makeMove(Board board);
}

// methods that cmutate the parameters passed to them are called to
// have side effect
// Methods return to you the data v/s doing the work themselves
//