package StepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WeatherStepDefs {
    @Given("city id: {int}")
    public void set_city_id(int cityId){

    }

    @When("we are requesting weather data")
    public void request_weather() {

    }
    @Then("lon is {double}")
    public void check_lon(double lon) {

    }
    @Then("lat is {double}")
    public void check_lat(double lat) {

    }
    @And("temp is {double}")
    public void check_temp(double temp) {

    }

}
