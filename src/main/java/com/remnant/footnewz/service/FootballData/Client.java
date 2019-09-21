package com.remnant.footnewz.service.FootballData;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Client<T> {
    public static final String BASE_URL = "https://api.football-data.org/v2/";
    private String endPoint;
    private HttpEntity entity;
    private HttpMethod httpMethod;
    private final Class<T> tClass;
    private RestTemplate restTemplate;

    public Client(String endPoint, HttpMethod httpMethod, Class<T> tClass) {
        this.endPoint = endPoint;
        this.httpMethod = httpMethod;
        restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-Auth-Token", "bca1302f09c24a6da8603d82ae58a6b2");
        entity = new HttpEntity(headers);
        this.tClass = tClass;
    }

    public String getFullUrl() {
        return BASE_URL + endPoint;
    }

    public T getResponse() {
        ResponseEntity<T> responseEntity = restTemplate.exchange(getFullUrl(), httpMethod, entity, tClass);
        return responseEntity.getBody();
    }
}
