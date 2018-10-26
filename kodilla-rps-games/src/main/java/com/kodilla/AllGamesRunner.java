package com.kodilla;

import com.kodilla.rps.Game;

import java.util.Scanner;

public class AllGamesRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select the game you want to play: (1) - RPS, (2) - RPSLS, (3)-RPSLS Computer Cheating :), (4)-EXIT");
            String s = scanner.nextLine();
            Game game = null;
            GameFactory factory = new GameFactory();
            if (s.equals("1")) {
                game = factory.makeGame(GameFactory.STANDARDGAME);
            } else if (s.equals("2")) {
                game = factory.makeGame(GameFactory.GAMERPSLS);
            } else if (s.equals("3")) {
                game = factory.makeGame(GameFactory.GAMERPSLSCHEATING);
            } else if (s.equals("4")) {
                System.out.println("See you next time");
                return;
            } else {
                System.out.println("Wrong key, try: (1), (2), (3), (4)");
            }
            if (game != null) {
                game.playGame();
            }
        }
    }
}