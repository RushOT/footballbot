package com.remnant.footnewz;

import com.remnant.footnewz.model.FootballData.StandingsContainer;
import com.remnant.footnewz.model.FootballData.Table;
import com.remnant.footnewz.model.FootballData.Team;
import com.remnant.footnewz.model.Telegram.Bot;
import com.remnant.footnewz.model.Telegram.Channel;
import com.remnant.footnewz.model.Telegram.Responses.SendMessageResponse;
import com.remnant.footnewz.service.FootballData.League;
import com.remnant.footnewz.service.FootballData.LeagueTable;
import com.remnant.footnewz.service.Telegram.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        Channel channel = new Channel("@football_news_eng");
        Bot bot = new Bot("979138193:AAEuA_DoBeMHDcZoEeeZa9YCFji0IZfZnRs");
        MessageService messageService = new MessageService();
        messageService.sendMessageToChannel(channel, bot);

        /*LeagueTable leagueTable = new LeagueTable();
        StandingsContainer container = leagueTable.get(League.ID_PREMIER_LEAGUE);
        for (Table table: container.getStandings().get(0).getTables()) {
            Team team = table.getTeam();
            log.info("Team: " + team.getName() + ". Played: " + table.getPlayedGames().toString() + " Wins: " + table.getWon().toString());
        }*/
    }
}
