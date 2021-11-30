package dev.naman.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    public List<List<Cell>> getBoard() {
        return board;
    }

    private List<List<Cell>> board;

    private final int rows;
    private final int columns;

    Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.createBoard();
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void createBoard() {
        board = new ArrayList<>();
        for(int i = 0;i<this.getRows();i++) {
            board.add(new ArrayList<Cell>());
            for(int j = 0;j<this.getColumns();j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void printBoard() {
        for (List<Cell> cells : board) {
            int rowSize = cells.size();
            for (int j = 0; j < rowSize; ++j) {
                Symbol symbol = cells.get(j).symbol;
                if (symbol == null) {
                    System.out.print(' ');
                } else {
                    System.out.print(symbol.getSymbol());
                }
                if (j < rowSize - 1) {
                    System.out.print('|');
                }
            }
            System.out.println();
        }
    }

    private boolean hasRowSameCharacter(int rowIndex) {
        for(int j = 0;j<this.getColumns()-1;j++) {
            Symbol cell1Symbol = board.get(rowIndex).get(j).symbol;
            Symbol cell2Symbol = board.get(rowIndex).get(j+1).symbol;
            if(cell1Symbol == null || cell2Symbol == null || cell1Symbol.getSymbol() != cell2Symbol.getSymbol()) {
                return false;
            }
        }
        return true;
    }

    private boolean hasColumnSameCharacter(int columnIndex) {
        for(int i = 0;i<this.getRows()-1;i++) {
            Symbol cell1Symbol = board.get(i).get(columnIndex).symbol;
            Symbol cell2Symbol = board.get(i+1).get(columnIndex).symbol;
            if(cell1Symbol == null || cell2Symbol == null || cell1Symbol.getSymbol() != cell2Symbol.getSymbol()) {
                return false;
            }
        }
        return true;
    }

    public int getWinningRow() {
        for(int i = 0;i<this.getRows();i++) {
            if(hasRowSameCharacter(i)) {
                return i;
            }
        }
        return -1;
    }

    public int getWinningColumn() {
        for(int j = 0;j<this.getColumns();j++) {
            if(hasColumnSameCharacter(j)) {
                return j;
            }
        }
        return -1;
    }

    public void updateBord(Move move) {
        int row = move.getX();
        int column = move.getY();
        board.get(row).get(column).setSymbol(move.getSymbol());
    }

    public boolean isValidMove(Move move) {
        int row = move.getX();
        int column = move.getY();
        if(row<0 || row>= this.getRows() || column<0 || column>= this.getColumns()) {
            return false;
        }
        return this.getBoard().get(row).get(column).getSymbol() == null;
    }

}


// wrapper classes
// I will create a deep copy of the class
// In Java it is impossible to create a deep copy


// In java everything is p[ass by value
// int a = 10;
// add(a) add(10)
// Cell a = new Cell() // value in a is not the object but it is the address of the object. If address a was 200
// doSomething(a) {
//   a.x = 10;
// }
