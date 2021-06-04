$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchCars.feature");
formatter.feature({
  "line": 2,
  "name": "Accesptance testing to validate search car feature is working",
  "description": "       In order to validate that\n       the search car page is working fine \n       We will do acceptance testing",
  "id": "accesptance-testing-to-validate-search-car-feature-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@searchCar"
    }
  ]
});
formatter.before({
  "duration": 3071879900,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate search cars page",
  "description": "",
  "id": "accesptance-testing-to-validate-search-car-feature-is-working;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on the home page \"https://www.carsguide.com.au\" of Cars guide page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I move to  menu",
  "rows": [
    {
      "cells": [
        "menu"
      ],
      "line": 12
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 13
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I clicked on \"Search Cars\" link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select car brand as \"BMW\" from Anymake drop down",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select model as \"1 Series\" from Any model dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select location as \"VIC - Melbourne\" from Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select price as \"$10,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the list of seached cars",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "The page title should be \"Bmw 1 Series Under 10000 for Sale Melbourne VIC | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SeaarchCarsSteps.i_am_on_the_home_page_of_Cars_guide_page(String)"
});
formatter.result({
  "duration": 16104175300,
  "status": "passed"
});
formatter.match({
  "location": "SeaarchCarsSteps.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 3165103900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search Cars",
      "offset": 14
    }
  ],
  "location": "SeaarchCarsSteps.i_clicked_on_Search_Cars_link(String)"
});
formatter.result({
  "duration": 11650690200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 21
    }
  ],
  "location": "SeaarchCarsSteps.select_car_brand_as_from_Anymake_drop_down(String)"
});
formatter.result({
  "duration": 4598732300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 17
    }
  ],
  "location": "SeaarchCarsSteps.select_model_as_from_Any_model_dropdown(String)"
});
formatter.result({
  "duration": 4410125700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "VIC - Melbourne",
      "offset": 20
    }
  ],
  "location": "SeaarchCarsSteps.select_location_as_from_Location_dropdown(String)"
});
formatter.result({
  "duration": 5331193600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$10,000",
      "offset": 17
    }
  ],
  "location": "SeaarchCarsSteps.select_price_as_from_price_dropdown(String)"
});
formatter.result({
  "duration": 3365058100,
  "status": "passed"
});
formatter.match({
  "location": "SeaarchCarsSteps.click_on_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 28727046800,
  "status": "passed"
});
formatter.match({
  "location": "SeaarchCarsSteps.i_should_see_the_list_of_seached_cars()"
});
formatter.result({
  "duration": 151700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 10000 for Sale Melbourne VIC | carsguide",
      "offset": 26
    }
  ],
  "location": "SeaarchCarsSteps.the_page_title_should_be(String)"
});
formatter.result({
  "duration": 21268100,
  "status": "passed"
});
formatter.after({
  "duration": 2937116700,
  "status": "passed"
});
formatter.uri("usedCars.feature");
formatter.feature({
  "line": 2,
  "name": "Accesptance testing to validate search car feature is working",
  "description": "       In order to validate that\r\n       the search car page is working fine \r\n       We will do acceptance testing",
  "id": "accesptance-testing-to-validate-search-car-feature-is-working",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@used-CarSearch"
    }
  ]
});
formatter.before({
  "duration": 2376235600,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate used cars page",
  "description": "",
  "id": "accesptance-testing-to-validate-search-car-feature-is-working;validate-used-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I am on the home page \"https://www.carsguide.com.au\" of Cars guide page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I move to  menu",
  "rows": [
    {
      "cells": [
        "menu"
      ],
      "line": 12
    },
    {
      "cells": [
        "buy + sell"
      ],
      "line": 13
    },
    {
      "cells": [
        "reviews"
      ],
      "line": 14
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I clicked on used car \"Used\" link",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "select Used car brand as \"Audi\" from Anymake drop down",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select used car model as \"A4\" from Any model dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "select used car location as \"ACT - All\" from Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select used car price as \"$20,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "click on used car Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I should see the list of Used cars",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "The page title of used cars be \"Used Audi A4 Under 20000 for Sale ACT | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.carsguide.com.au",
      "offset": 23
    }
  ],
  "location": "SeaarchCarsSteps.i_am_on_the_home_page_of_Cars_guide_page(String)"
});
formatter.result({
  "duration": 16074257300,
  "status": "passed"
});
formatter.match({
  "location": "SeaarchCarsSteps.i_move_to_menu(String\u003e)"
});
formatter.result({
  "duration": 3177146000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used",
      "offset": 23
    }
  ],
  "location": "UsedCarsSteps.i_clicked_on_used_car_link(String)"
});
formatter.result({
  "duration": 9552102900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 26
    }
  ],
  "location": "UsedCarsSteps.select_Used_car_brand_as_from_Anymake_drop_down(String)"
});
formatter.result({
  "duration": 720390800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A4",
      "offset": 26
    }
  ],
  "location": "UsedCarsSteps.select_used_car_model_as_from_Any_model_dropdown(String)"
});
formatter.result({
  "duration": 14017049800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ACT - All",
      "offset": 29
    }
  ],
  "location": "UsedCarsSteps.select_used_car_location_as_from_Location_dropdown(String)"
});
formatter.result({
  "duration": 1110352000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20,000",
      "offset": 26
    }
  ],
  "location": "UsedCarsSteps.select_used_car_price_as_from_price_dropdown(String)"
});
formatter.result({
  "duration": 1242920200,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.click_on_used_car_Find_My_Next_Car_button()"
});
formatter.result({
  "duration": 9433612400,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarsSteps.i_should_see_the_list_of_Used_cars()"
});
formatter.result({
  "duration": 45800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 20000 for Sale ACT | carsguide",
      "offset": 32
    }
  ],
  "location": "UsedCarsSteps.the_page_title_of_used_cars_be(String)"
});
formatter.result({
  "duration": 18007600,
  "status": "passed"
});
formatter.after({
  "duration": 4849434000,
  "status": "passed"
});
});