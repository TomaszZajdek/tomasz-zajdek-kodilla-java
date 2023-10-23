package com.kodilla.rps;

public class Rps {
    private int totalRounds;
    private int playerWins;
    private int computerWins;
    private int currentRound;
    private String playerName;

    public Rps(int totalRounds, String playerName) {
        this.totalRounds = totalRounds;
        this.computerWins = 0;
        this.playerWins = 0;
        this.currentRound = 0;
        this.playerName = playerName;
    }

    private int computerChoice(int playerChoice) {
       int number = (int) (Math.random() * 100)+1;
       if(number <= 25) {
           return playerChoice;
       } else if (number > 25 && number <= 50) {
           if(playerChoice == 1) {
               return 3;
           } else if (playerChoice == 2) {
               return 1;
           } else if (playerChoice == 3) {
               return 2;
           }
       } else if(number > 50 && number <= 100) {
           if (playerChoice == 1) {
               return 2;
           } else if (playerChoice == 2) {
               return 3;
           } else if (playerChoice == 3) {
               return 1;
           }
       } return 0;

       }
    private int gameResult (int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return 0;
        } else if ((playerChoice == 1 && computerChoice == 3) ||
                   (playerChoice == 2 && computerChoice == 1) ||
                   (playerChoice == 3 && computerChoice == 2)) {
            return 1;
        } else {
            return -1;
        }
    }
    public void playRound(int playerChoice) {

        if (currentRound <= totalRounds) {
                currentRound++;
                int computerChoice = computerChoice(playerChoice);
                int gameResult = gameResult(playerChoice, computerChoice);
                roundResult(playerChoice, computerChoice, gameResult);
                if (gameResult == 1) {
                    playerWins++;

                } else if (gameResult == -1) {
                    computerWins++;
                }
        }
    }
    public String rockPaperScissors(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "Invalid choice";
        }
    }
    public void roundResult(int playerChoice, int computerChoice, int roundResult) {
        System.out.println("Round nr : " + currentRound);
        System.out.println("Your choice : " + rockPaperScissors(playerChoice));
        System.out.println("Computer choice : " + rockPaperScissors(computerChoice));
        if(roundResult == 0) {
            System.out.println("DRAW");
        } else if (roundResult == 1) {
            System.out.println("Congratulations - point for You");
        } else {
            System.out.println("Point for computer");
        }
    }

    public void endGame() {
        System.out.println("After " + currentRound + " rounds we have a winner...");
        if(playerWins > computerWins) {
            System.out.println("Congratulations " + playerName + " !!!");
        } else if (playerWins < computerWins) {
            System.out.println("Computer wins");
        } else {
            System.out.println("Och wait it's a DRAW ! ");
        }
    }
}