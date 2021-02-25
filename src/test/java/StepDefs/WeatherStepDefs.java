package StepDefs;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import model.Weather;
import model.WeatherResponse;
import org.junit.jupiter.api.Assertions;
import requesters.WeatherRequester;

import java.util.List;
import java.util.Map;

public class WeatherStepDefs {
    private int cityId;
    private WeatherResponse response;

    @Given("city id: {int}")
    public void set_city_id(int cityId){
        this.cityId = cityId;

    }

    @When("we are requesting weather data")
    public void request_weather() throws JsonProcessingException {
        // call Weather Requester
        WeatherRequester requester = new WeatherRequester();
        response = requester.getWeather(cityId);

    }
    @Then("lon is {double}")
    public void check_lon(double lon) {
        Assertions.assertEquals(lon, response.getCoord().getLon(), "Wrong lon");

    }
    @Then("lat is {double}")
    public void check_lat(double lat) {

    }
    @Then("weather id is {int}")
    public void check_id(int id) {

    }
    @And("weather main is {string}")
    public void check_weather_main(String main) {

    }
    @Then("description is {string}")
    public void check_despription(String description) {

    }
    @And("icon is {string}")
    public void check_icon(String icon) {

    }
    @And("base is {string}")
    public void check_base(String main) {

    }

    @Then("main data is:")
    public void check_main_data(Map<String, String> params) {

    }


    @And("temp is {double}")
    public void check_temp(double temp) {

    }
    @And("humidity is {int}")
    public void check_humidity(int humidity) {

    }

    @And("pressure is {int}")
    public void check_pressure(int pressure) {

    }

    @And("temp_min is {double}")
    public void check_temp_min(double temp_min) {

    }
    @And("temp_max is {double}")
    public void check_temp_max(double temp_max) {

    }

    @And("visibility is {int}")
    public void check_visibility(int visibility) {

    }
    @And("speed is {double}")
    public void check_speed(double speed) {

    }
    @And("deg is {int}")
    public void check_deg(int deg) {

    }
    @And("all is {int}")
    public void check_all(int all) {

    }
    @And("dt is {int}")
    public void check_dt(int dt) {

    }

    @And("type is {int}")
    public void check_type(int type) {

    }

    @And("sys id is {int}")
    public void check_sys_id(int id) {

    }
    @And("message is {double}")
    public void check_message(double message) {

    }
    @And("country is {string}")
    public void check_country(String country) {

    }
    @And("sunrise is {int}")
    public void check_sunrise(int sunrise) {

    }
    @And("sunset is {int}")
    public void check_sunset(int sunset) {

    }
    @And("town id is {int}")
    public void check_town_id(int id) {

    }

    @And("name is {string}")
    public void check_name(String name) {

    }
    @And("cod is {int}")
    public void check_cod(int cod) {

    }





    //   @And("weather main is {List<Weather>}")
 //   public void check_main(List<Weather> main) {

//    }


//    @And("temp is {double}")
 //   public void check_temp(double temp) {

 //   }


}
