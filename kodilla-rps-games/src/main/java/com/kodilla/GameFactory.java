package com.kodilla;

import com.kodilla.rps.Game;
import com.kodilla.rps.StandardGame;
import com.kodilla.rpsls.GameRPSLS;
import com.kodilla.rpslsCompCheating.GameRPSLSCheating;

public final class GameFactory {
    public static final String STANDARDGAME = "STANDARDGAME";
    public static final String GAMERPSLS = "GAMERPSLS";
    public static final String GAMERPSLSCHEATING = "GAMERPSLSCHEATING";

    public final Game makeGame(final String gameClass) {
        switch (gameClass) {
            case STANDARDGAME:
                return new StandardGame();
            case GAMERPSLS:
                return new GameRPSLS();
            case GAMERPSLSCHEATING:
                return new GameRPSLSCheating();
            default:
                return null;
        }
    }
}
