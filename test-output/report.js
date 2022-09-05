$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ContactPage.feature");
formatter.feature({
  "line": 1,
  "name": "Contact Page Field Validation",
  "description": "",
  "id": "contact-page-field-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify the fields and Errors of the Contact Page",
  "description": "",
  "id": "contact-page-field-validation;verify-the-fields-and-errors-of-the-contact-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on the HomePage of the Jupiter testing site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user click on the Contact Page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user click on the Submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Verify error messages for each field",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User populate mandatory fields and click on submit",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Validate errors are gone",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Validate successful submission message",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingPageMethod.user_is_on_the_HomePage_of_the_Jupiter_testing_site()"
});
formatter.result({
  "duration": 12568245184,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageMethod.user_click_on_the_Contact_Page()"
});
formatter.result({
  "duration": 78120679,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageMethod.user_click_on_the_Submit_button()"
});
formatter.result({
  "duration": 342256517,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageMethod.verify_error_messages_for_each_field()"
});
formatter.result({
  "duration": 104940948,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageMethod.user_populate_mandatory_fields_and_click_on_submit()"
});
formatter.result({
  "duration": 1043359926,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageMethod.validate_errors_are_gone()"
});
formatter.result({
  "duration": 45223701671,
  "status": "passed"
});
formatter.match({
  "location": "ContactPageMethod.validate_successful_submission_message()"
});
formatter.result({
  "duration": 4498133817,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingPageMethod.close_the_browser()"
});
formatter.result({
  "duration": 913793936,
  "status": "passed"
});
formatter.uri("ShoppingPage.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Page Validation",
  "description": "",
  "id": "shopping-page-validation",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Verify the fields and Errors of the Contact Page",
  "description": "",
  "id": "shopping-page-validation;verify-the-fields-and-errors-of-the-contact-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the HomePage of the Jupiter testing site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on the Shop Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user selects the \"Stuffed Frog\" , \"FluffyBunny\"  and \"ValentineBear\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Enters the value quantity of \u003cStuffed Frog\u003e , \u003cFluffyBunny\u003e  and \u003cValentineBear\u003e Each Item and verify subtotal",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify that total is equal sum sub totals",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "shopping-page-validation;verify-the-fields-and-errors-of-the-contact-page;",
  "rows": [
    {
      "cells": [
        "Stuffed Frog",
        "FluffyBunny",
        "ValentineBear"
      ],
      "line": 15,
      "id": "shopping-page-validation;verify-the-fields-and-errors-of-the-contact-page;;1"
    },
    {
      "cells": [
        "2",
        "5",
        "3"
      ],
      "line": 16,
      "id": "shopping-page-validation;verify-the-fields-and-errors-of-the-contact-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 16,
  "name": "Verify the fields and Errors of the Contact Page",
  "description": "",
  "id": "shopping-page-validation;verify-the-fields-and-errors-of-the-contact-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 4,
      "name": "@Testing"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user is on the HomePage of the Jupiter testing site",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user click on the Shop Page",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "user selects the \"Stuffed Frog\" , \"FluffyBunny\"  and \"ValentineBear\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user click on the cart",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user Enters the value quantity of 2 , 5  and 3 Each Item and verify subtotal",
  "matchedColumns": [
    0,
    1,
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Verify that total is equal sum sub totals",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "ShoppingPageMethod.user_is_on_the_HomePage_of_the_Jupiter_testing_site()"
});
formatter.result({
  "duration": 8215337356,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingPageMethod.user_click_on_the_Shop_Page()"
});
formatter.result({
  "duration": 105077395,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Stuffed Frog",
      "offset": 18
    },
    {
      "val": "FluffyBunny",
      "offset": 35
    },
    {
      "val": "ValentineBear",
      "offset": 54
    }
  ],
  "location": "ShoppingPageMethod.user_selects_the_and(String,String,String)"
});
formatter.result({
  "duration": 634397780,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingPageMethod.user_click_on_the_cart()"
});
formatter.result({
  "duration": 90396070,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 34
    },
    {
      "val": "5",
      "offset": 38
    },
    {
      "val": "3",
      "offset": 45
    }
  ],
  "location": "ShoppingPageMethod.user_Enters_the_value_quantity_of_and_Each_Item_and_verify_subtotal(int,int,int)"
});
formatter.result({
  "duration": 967551599,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingPageMethod.verify_that_total_is_equal_sum_sub_totals()"
});
formatter.result({
  "duration": 88270276,
  "status": "passed"
});
formatter.match({
  "location": "ShoppingPageMethod.close_the_browser()"
});
formatter.result({
  "duration": 627330918,
  "status": "passed"
});
});