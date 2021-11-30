package dev.naman.strategies.automove;

import dev.naman.models.Board;
import dev.naman.models.Cell;
import dev.naman.models.Move;
import dev.naman.models.Symbol;

import java.util.List;

public class RandomMoveStrategy implements IAutomaticMoveStrategy {
    @Override
    public Move makeMove(Board board, Symbol symbol) {
        List<List<Cell>> playingBoard = board.getBoard();
        Move botMove = null;
        for(int i = 0;i<board.getRows();i++) {
            for(int j = 0;j<board.getColumns();j++) {
                if(playingBoard.get(i).get(j).getSymbol() == null) {
                    botMove = new Move(i, j, symbol);
                    break;
                }
            }
            if(botMove != null) {
                break;
            }
        }
        return botMove;
    }
}
