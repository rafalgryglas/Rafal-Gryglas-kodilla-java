package com.kodilla.rpsls;

import java.util.Scanner;

import static com.kodilla.rpsls.MovesEnum.*;

public class UserDialogs {

    public static boolean firstViewDialogs() {
        Scanner inputYourChoice = new Scanner(System.in);

        while (true) {
            System.out.println("What would like to do? \n" +
                    "(1) - play the game, (2) - hotkey to play, (3) - read rules, (KuYQdZ##%) - exit ");
            String userSelection = inputYourChoice.next();
            if (userSelection.equals("1")) {
                return true;
            } else if (userSelection.equals("2")) {
                System.out.println("Key (R) -  play ROCK\n" +
                        "Key (P) -  play PAPER\n" +
                        "Key (S) -  play SCISSORS\n" +
                        "Key (L) -  play LIZARD \n" +
                        "Key (V) -  play SPOCK\n");

            } else if (userSelection.equals("3")) {
                System.out.println("Scissors cuts Paper \n" +
                        "Paper covers Rock \n" +
                        "Rock crushes Lizard \n" +
                        "Lizard poisons Spock \n" +
                        "Spock smashes Scissors \n" +
                        "Scissors decapitates Lizard \n" +
                        "Lizard eats Paper \n" +
                        "Paper disproves Spock \n" +
                        "Spock vaporizes Rock \n" +
                        "Rock crushes Scissors\n");

            } else if (userSelection.equals("KuYQdZ##%")) {
                System.out.println("Oh no :( See you letter");
                return false;
            } else {
                System.out.println("Something wrong with yours keyboard :)");
            }
        }
    }

    public static void gameTalk(String name, int rounds) {
        System.out.println("Welcome to me game ( ROCK-PAPER-SCISSORS-LIZARD-SPOCK) ");
        System.out.println(name + ", number of rounds is: " + rounds);
        System.out.println("Let the game begin!!!\n");
    }

    public static String getNameOfUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your name: ");
            String s = scanner.nextLine();
            if (s.length() >= 2) {
                return s;
            } else {
                System.out.println("Too short, you have to write minimum two letters");
            }
        }
    }

    public static int getRoundToWin() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Number of rounds: ");
            String s = scanner.nextLine();
            try {
                int n = Integer.parseInt(s);
                return n;
            } catch (Exception e) {
                System.out.println("Wrong data: you have to choose an integer");
            }
        }
    }

    public static MovesEnum getUserMove() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select weapon: (R)-rock, (P)-paper, (S)-scissors, (L)-lizard, (V)-spock");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("R")) {
                return ROCK;
            } else if (s.equals("P")) {
                return PAPER;
            } else if (s.equals("S")) {
                return SCISSORS;
            } else if (s.equals("L")) {
                return LIZARD;
            } else if (s.equals("V")) {
                return SPOCK;
            } else {
                System.out.println("Wrong key: use (R), (P), (S), (L), (V)");
            }
        }
    }

    public static boolean oneMoreGame() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What's now? (N)-new game, (X)-exit");
            String s = scanner.nextLine().toUpperCase();
            if (s.equals("N")) {
                return true;
            } else if (s.equals("X")) {
                return false;
            } else {
                System.out.println("Wrong key: use (N) or (X)");
            }
        }
    }
}