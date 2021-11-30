package dev.naman.strategies.automove;

import dev.naman.models.Board;
import dev.naman.models.Move;
import dev.naman.models.Symbol;

public interface IAutomaticMoveStrategy {

    Move makeMove(Board board, Symbol symbol);
}

// methods that cmutate the parameters passed to them are called to
// have side effect
// Methods return to you the data v/s doing the work themselves
//
