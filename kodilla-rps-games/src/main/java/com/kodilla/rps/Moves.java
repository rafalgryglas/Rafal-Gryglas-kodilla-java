package com.kodilla.rps;

import java.util.Random;

public class Moves {

    public static MovesEnum computerMoves() {
        Random computerRandomMoves = new Random();
        int computerMove = computerRandomMoves.nextInt(3) + 1;
        if (computerMove == 1) {
            System.out.println("Computer chose ROCK");
            return MovesEnum.ROCK;
        } else if (computerMove == 2) {
            System.out.println("Computer chose PAPER");
            return MovesEnum.PAPER;
        } else {
            System.out.println("Computer chose SCISSORS");
            return MovesEnum.SCISSORS;
        }
    }

    public static void selectGamesMoves(String name, int rounds) {

        int winRoundByPlayer = 0;
        int winRoundByComputer = 0;
        int roundNumber = 0;
        while (roundNumber < rounds) {
            MovesEnum playerMove = UserDialogs.getUserMove();
            MovesEnum computerMove = computerMoves();
            PlayerEnum winner = selectWinner(playerMove, computerMove);
            if (winner == PlayerEnum.HUMAN) {
                winRoundByPlayer++;
            } else if (winner == PlayerEnum.COMPUTER) {
                winRoundByComputer++;
            } else {
                winRoundByPlayer++;
                winRoundByComputer++;
            }
            System.out.println(name + " score:  " + winRoundByPlayer);
            System.out.println("Computer's score:  " + winRoundByComputer);
            roundNumber++;
        }
        if (winRoundByComputer > winRoundByPlayer) {
            System.out.println("Computer wins this game");
        } else if (winRoundByComputer < winRoundByPlayer) {
            System.out.println(name + " wins this game. Congratulations!!!");
        } else {
            System.out.println("It's DRAW");
        }
    }

    private static PlayerEnum selectWinner(MovesEnum playerMove, MovesEnum computerMove) {
        if (playerMove == MovesEnum.ROCK && computerMove == MovesEnum.SCISSORS) {
            System.out.println("You win this round");
            return PlayerEnum.HUMAN;
        } else if (playerMove == MovesEnum.SCISSORS && computerMove == MovesEnum.PAPER) {
            System.out.println("You win this round");
            return PlayerEnum.HUMAN;
        } else if (playerMove == MovesEnum.PAPER && computerMove == MovesEnum.ROCK) {
            System.out.println("You win this round");
            return PlayerEnum.HUMAN;
        } else if (playerMove == MovesEnum.PAPER && computerMove == MovesEnum.SCISSORS) {
            System.out.println("Computer win this round");
            return PlayerEnum.COMPUTER;
        } else if (playerMove == MovesEnum.SCISSORS && computerMove == MovesEnum.ROCK) {
            System.out.println("Computer win this round");
            return PlayerEnum.COMPUTER;
        } else if (playerMove == MovesEnum.ROCK && computerMove == MovesEnum.PAPER) {
            System.out.println("Computer win this round");
            return PlayerEnum.COMPUTER;
        } else {
            System.out.println("You and computer chosen the same shapes - DRAW!");
        }
        return PlayerEnum.DRAW;
    }
}