package dev.naman.models;

public class HumanPlayer extends Player {
    User user;

    public static Builder getBuilder() {
        return new Builder();
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
