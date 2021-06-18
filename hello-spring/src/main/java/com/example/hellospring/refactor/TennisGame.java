package com.example.hellospring.refactor;

public class TennisGame {

    private int player1Score;
    private int player2Score;
    private String player1Name;
    private String player2Name;

    public TennisGame(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore() {
        String calledScore;
        if (player1Score < 4 && player2Score < 4 && !(player1Score + player2Score == 6)) {
            String[] calledScoreSet = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            calledScore = calledScoreSet[player1Score];
            return (player1Score == player2Score) ? calledScore + "-All" : calledScore + "-" + calledScoreSet[player2Score];
        } else {
            if (player1Score == player2Score)
                return "Deuce";
            calledScore = player1Score > player2Score ? player1Name : player2Name;
            return ((player1Score - player2Score)*(player1Score - player2Score) == 1) ? "Advantage " + calledScore : "Win for " + calledScore;
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.player1Score += 1;
        else
            this.player2Score += 1;

    }

}