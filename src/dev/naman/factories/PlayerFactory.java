package dev.naman.factories;

import dev.naman.models.Bot;
import dev.naman.models.HumanPlayer;
import dev.naman.models.Player;

public class PlayerFactory {
    public static HumanPlayer.Builder createHumanPlayer() {
        return HumanPlayer.getBuilder();
    }

    public static Bot.Builder createBot() {
        return Bot.getBuilder();
    }
}
