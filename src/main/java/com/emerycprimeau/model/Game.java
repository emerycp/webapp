package com.emerycprimeau.model;

public class Game {
    public int ID;
    public String Name;
    public Integer Score;
    public boolean EstCompleter;
    public String date;

    public Game () {}

    public Game(String name, int score, boolean EstCompleter) {
        this.Name = name;
        this.Score = score;
        this.EstCompleter = EstCompleter;
    }

    public Game(int gameId, String date, String name, int score, boolean EstCompleter) {
        this.ID = gameId;
        this.date = date;
        this.Name = name;
        this.Score = score;
        this.EstCompleter = EstCompleter;
    }
}
