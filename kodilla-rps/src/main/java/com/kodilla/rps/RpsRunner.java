package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();
        boolean wannaPlay = true;
        while (wannaPlay) {
            System.out.print("Enter the total number of rounds : ");
            int totalRounds = scanner.nextInt();

            Rps game = new Rps(totalRounds, playerName);

            boolean endGame = false;
            int playedRounds = 1;

            while (!endGame) {
                if (playedRounds == totalRounds) {
                    endGame = true;
                }
                System.out.println("Choose your move:");
                System.out.println("1 - Rock");
                System.out.println("2 - Paper");
                System.out.println("3 - Scissors");
                System.out.println("x - Quit the game");

                char playerChoice = scanner.next().charAt(0);

                switch (playerChoice) {
                    case '1':
                        playedRounds++;
                        game.playRound(Integer.parseInt(String.valueOf(playerChoice)));
                        break;
                    case '2':
                        playedRounds++;
                        game.playRound(Integer.parseInt(String.valueOf(playerChoice)));
                        break;
                    case '3':
                        playedRounds++;
                        game.playRound(Integer.parseInt(String.valueOf(playerChoice)));
                        break;
                    case 'x':
                        endGame = true;
                        break;
                    default:
                        System.out.println("Invalid choice. Please choose 1, 2, 3, or x.");
                        break;
                }
            }
            game.endGame();
            System.out.println("Do You want to play once more?");
            System.out.println("Type N - if you want to start a new game");
            System.out.println("Type X - if you want to quit the game");

            char playAgainChoice = scanner.next().charAt(0);
            if (playAgainChoice == 'X' || playAgainChoice == 'x') {
                wannaPlay = false;
            }
        }
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}
