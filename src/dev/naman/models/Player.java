package dev.naman.models;

public abstract class Player {
    Symbol symbol;

    public Character getSymbol() {
        return symbol.getSymbol();
    }

    public abstract Move makeMove(Board b);
}
