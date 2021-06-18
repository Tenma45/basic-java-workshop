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
        String player1CalledScore;
        String player2CalledScore;
        final int maxPlayerScoreBeforeDeuce = 4;
        final int maxTotalScoreBeforeDeuce = 6;
        boolean isDeuce = player1Score == player2Score;
        boolean finishDeuce = Math.abs(player1Score-player2Score) > 1;
        if (    player1Score < maxPlayerScoreBeforeDeuce
                && player2Score < maxPlayerScoreBeforeDeuce
                && !(player1Score + player2Score == maxTotalScoreBeforeDeuce)) {
            String[] calledScoreSet = new String[]{"Love", "Fifteen", "Thirty", "Forty"};
            player1CalledScore = calledScoreSet[player1Score];
            player2CalledScore = calledScoreSet[player2Score];
            return (isDeuce) ? player1CalledScore + "-All"
                    : player1CalledScore + "-" + player2CalledScore;
        } else {
            if (isDeuce)
                return "Deuce";
            String leadPlayerName = player1Score > player2Score ? player1Name : player2Name;
            return (!finishDeuce) ? "Advantage " + leadPlayerName : "Win for " + leadPlayerName;
        }
    }

    public void wonPoint(String playerName) {
        if ("player1".equals(playerName))
            this.player1Score += 1;
        else
            this.player2Score += 1;
    }

}