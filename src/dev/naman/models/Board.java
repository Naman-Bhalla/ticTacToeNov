package dev.naman.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    Board(int rows, int columns) {
        board = new ArrayList<>();
        for(int i = 0;i<rows;i++) {
            board.add(new ArrayList<Cell>());
            for(int j = 0;j<columns;j++) {
                board.get(i).add(new Cell(i, j));
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.size(); ++i) {
            int rowSize =  board.get(i). size();
            for (int j = 0; j < rowSize; ++j) {
                Symbol symbol =  board.get(i).get(j).symbol;
                if(symbol == null) {
                    System.out.print(' ');
                } else {
                    System.out.print(symbol.getSymbol());
                }
                if(j<rowSize - 1) {
                    System.out.print('|');
                }
            }
            System.out.println();
        }
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
