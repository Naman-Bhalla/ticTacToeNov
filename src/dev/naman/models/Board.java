package dev.naman.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    Board(int rows, int columns) {
        board = new ArrayList<>();
        for (int i = 0; i < rows; ++i) {
            board.add(new ArrayList<>());
            for (int j = 0; j < columns; ++j) {
                board.get(i).add(new Cell());
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < board.size(); ++i) {
            for (int j = 0; j < board.get(i). size(); ++j) {
                System.out.printf("%c ", board.get(i).get(j).symbol.getSymbol());
            }
        }
        System.out.printf("\n");
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
