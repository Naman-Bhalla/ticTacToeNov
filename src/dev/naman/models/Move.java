package dev.naman.models;

public class Move {
    private int x;
    private int y;
    private Symbol symbol;
    public Symbol getSymbol() {
        return symbol;
    }


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Move(int x, int y, Symbol symbol) {
      this.x = x;
      this.y = y;
      this.symbol = symbol;
    }
}
