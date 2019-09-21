package com.remnant.footnewz.model.FootballData;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Standings {

    private String stage;

    private String type;

    @JsonProperty("table")
    private List<Table> tables;

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Table> getTables() {
        return tables;
    }

    public void setTables(List<Table> tables) {
        this.tables = tables;
    }
}
