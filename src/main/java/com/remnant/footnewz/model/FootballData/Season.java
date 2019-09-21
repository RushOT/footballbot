package com.remnant.footnewz.model.FootballData;

public class Season {
    private String id;
    private String startDate;
    private String endDate;
    private Short currentMatchday;
    private Short winner;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Short getCurrentMatchday() {
        return currentMatchday;
    }

    public void setCurrentMatchday(Short currentMatchday) {
        this.currentMatchday = currentMatchday;
    }

    public Short getWinner() {
        return winner;
    }

    public void setWinner(Short winner) {
        this.winner = winner;
    }
}
