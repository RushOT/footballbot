package com.remnant.footnewz.model.FootballData;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Table {
    private Short position;
    private Short playedGames;
    private Short won;
    private Integer goalsFor;
    private Integer goalsAgainst;
    private Integer goalDifference;
    private Team team;

    public Short getPosition() {
        return position;
    }

    public void setPosition(Short position) {
        this.position = position;
    }

    public Short getPlayedGames() {
        return playedGames;
    }

    public void setPlayedGames(Short playedGames) {
        this.playedGames = playedGames;
    }

    public Short getWon() {
        return won;
    }

    public void setWon(Short won) {
        this.won = won;
    }

    public Integer getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public Integer getGoalDifference() {
        return goalDifference;
    }

    public void setGoalDifference(Integer goalDifference) {
        this.goalDifference = goalDifference;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}
