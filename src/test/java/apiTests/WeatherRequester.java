package apiTests;

import apiTests.model.Response;
import org.springframework.web.client.RestTemplate;

public class WeatherRequester {
    private final String URL_PREFIX = "https://samples.openweathermap.org/data/2.5/weather?q=";
    private final String URL_POSTFIX = "&appid=b6907d289e10d714a6e88b30761fae22";

    public Response getWeather(String city) {
        String url = URL_PREFIX + city + URL_POSTFIX;

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(url, Response.class).getBody();
    }
}
