package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class HighscoreWins {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String gameScore = gameScore(myScanner);
        String gameWinner = gameWinner(gameScore);

        System.out.println(gameWinner);
    }
    public static String gameScore(Scanner myScanner) {
        System.out.println("Please enter the game score: ");
        String gameScore = myScanner.nextLine();

        return gameScore;
    }
    /*
       Format uses:
       Home:Visitor|21:9
    */
    public static String gameWinner(String gameScore) {
        String[] teamNames = gameScore.split("[:|]");
        String homeTeam = teamNames[0];
        String awayTeam = teamNames[1];
        int homeScore = Integer.parseInt(teamNames[2]);
        int awayScore = Integer.parseInt(teamNames[3]);

        if (homeScore > awayScore) {
            return "Winner: " + homeTeam;
        }
        if (homeScore == awayScore) {
            return "Winner: Tie!";
        }
        return "Winner: " + awayTeam;
    }
}