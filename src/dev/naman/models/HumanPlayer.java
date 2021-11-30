package dev.naman.models;

import java.util.Scanner;

public class HumanPlayer extends Player {
    User user;
    private final Scanner in = new Scanner(System.in);
    public static Builder getBuilder() {
        return new Builder();
    }

    @Override
    public Move makeMove(Board board) {
        Move playerMove;
        while (true) {
            System.out.println("Top left cell defined as (1,1) and bottom right is defined as (rows, columns)");
            System.out.println("Enter row index to move(1-Based)");
            int x = in.nextInt() - 1;
            System.out.println("Enter column index to move(1-Based):");
            int y = in.nextInt() - 1;
            playerMove = new Move(x, y, this.symbol);
            if(board.isValidMove(playerMove)) {
                break;
            }
            System.out.println("Move not valid, Please enter a valid move");
        }
        return playerMove;
    }

    public static class Builder {
        private HumanPlayer humanPlayer;

        Builder() {
            this.humanPlayer = new HumanPlayer();
        }

        public Builder setUser(User user) {
            this.humanPlayer.user = user;
            return this;
        }

        public Builder setSymbol(char symbol) {
            this.humanPlayer.symbol = new Symbol(symbol);
            return this;
        }

        public HumanPlayer build() {
            return this.humanPlayer;
        }
    }
}
