package com.remnant.footnewz.service.Telegram;

import com.remnant.footnewz.model.Telegram.Bot;
import com.remnant.footnewz.model.Telegram.Channel;
import com.remnant.footnewz.model.Telegram.Responses.SendMessageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

public class MessageService {
    private static final String BASE_URL = "https://api.telegram.org/";

    private RestTemplate restTemplate;

    public MessageService() {
        this.restTemplate = new RestTemplate();
    }

    public boolean sendMessageToChannel(Channel channel, Bot bot, String text) {
        SendMessageResponse response = this.restTemplate.getForObject(
                getURI(bot.getToken(), channel.getId(), text),
                SendMessageResponse.class
        );

        return true;
    }

    private URI getURI(String botToken, String chatId, String text) {
        return UriComponentsBuilder
                .fromUriString(BASE_URL)
                .path("bot" + botToken + "sendMessage")
                .queryParam("chat_id", chatId)
                .queryParam("text", text)
                .build()
                .encode()
                .toUri();
    }
}
