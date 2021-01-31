package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherResponse {
    private Coord coord;

    @JsonProperty("weather") //privjazka k Json ( razreshenie weather v Json nazivatsja weathers !!!)
    private List<Weather> weathers; //tak kak spisok, to nado ne weather, a wheatherS!!  potomu dobavljaetsja verhnjaa stroka!
    private String base;


    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<Weather> getWeathers() {
        return weathers;
    }

    public void setWeathers(List<Weather> weathers) {
        this.weathers = weathers;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }
}
