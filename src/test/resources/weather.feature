Feature: Weather API

  Scenario: Testing city coordinates
    Given city id: 524901
    When we are requesting weather data
    Then lon is 145.77
    And lat is -16.92
    And weather id is 802
    And weather main is Clouds
    And description is scattered clouds
    And icon is 03n
    And base is stations
    And temp is 300.15
    And pressure is 1007
    And humidity is 74
    And temp_min is 300.15
    And temp_max is 300.15
    And visibility is 10000
    And speed is 3.6
    And deg is 160
    And all is 40
    And dt is 1485790200
    And type is 1
    And sys id is 8166
    And message is 0.2064
    And country is AU
    And sunrise is 1485720272
    And sunset is 1485766550
    And town id is 2172797
    And name is Cairns
    And cod is 200




    And temp is 300.15