package com.remnant.footnewz.service.FootballData;

import com.remnant.footnewz.model.FootballData.StandingsContainer;
import org.springframework.http.HttpMethod;

public class LeagueTable {

    private String endPoint = "competitions/%d/standings";
    private Client<StandingsContainer> client;

    public StandingsContainer get(int leagueId) {
        client = new Client<StandingsContainer>(String.format(endPoint, leagueId), HttpMethod.GET, StandingsContainer.class);
        return client.getResponse();
    }
}
