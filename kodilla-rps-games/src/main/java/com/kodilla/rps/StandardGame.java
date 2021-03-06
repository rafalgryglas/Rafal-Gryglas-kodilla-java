package com.kodilla.rps;

public class StandardGame implements Game {
    @Override
    public boolean playGame() {
        while (true) {
            if (UserDialogs.firstViewDialogs()) {
                String name = UserDialogs.getNameOfUser();
                int rounds = UserDialogs.getRoundToWin();
                UserDialogs.gameTalk(name, rounds);
                Moves.selectGamesMoves(name, rounds);
                if (!UserDialogs.oneMoreGame()) {
                    return false;
                }
            } else {
                return false;
            }
        }
    }
}