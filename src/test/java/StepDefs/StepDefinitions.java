package StepDefs;

import io.cucumber.java.en.Given;

public class StepDefinitions {
    @Given("Printed label Hello World")
    public void print_hello_world() {
        System.out.println("Hello, COVID-world!");
    }
//--    @Given("printed {string}")
//--    public void print_string(String stringToPrint) {
//--        System.out.println(stringToPrint);
//--    }
}
