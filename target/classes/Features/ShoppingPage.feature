Feature: Shopping Page Validation


@Testing
  Scenario Outline: Verify the fields and Errors of the Contact Page
    Given user is on the HomePage of the Jupiter testing site
    When user click on the Shop Page
    And user selects the "Stuffed Frog" , "FluffyBunny"  and "ValentineBear"
    And user click on the cart
    When user Enters the value quantity of <Stuffed Frog> , <FluffyBunny>  and <ValentineBear> Each Item and verify subtotal    
    And Verify that total is equal sum sub totals
    Then Close the browser
    
    Examples:
    | Stuffed Frog      | FluffyBunny |ValentineBear|
		| 	2								|       5     | 3           |
