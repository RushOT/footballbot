package com.remnant.footnewz.model.FootballData;

import java.util.List;

public class StandingsContainer {

    private Competition competition;

    private List<Standings> standings;

    private Season season;

    public Competition getCompetition() {
        return competition;
    }

    public void setCompetition(Competition competition) {
        this.competition = competition;
    }

    public List<Standings> getStandings() {
        return standings;
    }

    public void setStandings(List<Standings> standings) {
        this.standings = standings;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
