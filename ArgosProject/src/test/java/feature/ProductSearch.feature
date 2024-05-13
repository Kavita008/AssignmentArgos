Feature: Verify that user is able to add product to the cart and see the sub total
  @Smoketest
  Scenario:Verify search field

    Given the user navigate to the home page
    When the  user click on search box
    Then the user enter "Habitat Wooden Folding Chair - Light Wood" in the search box
    And the user click on search button
    Then user should see "Habitat Wooden Folding Chair - Light Wood" in the page
    And the user add Habitat Wooden Folding Chair - Light Wood to the cart
    Then the user click on go to trolley


  Scenario: Verify subtotal of the product

    Given the user navigate to the home page
    When the  user click on search box
    Then the user enter "Habitat Wooden Folding Chair - Light Wood" in the search box
    And the user click on search button
    Then user should see "Habitat Wooden Folding Chair - Light Wood" in the page
    And the user add Habitat Wooden Folding Chair - Light Wood to the cart
    Then the user click on go to trolley
    When the user click on the quantity box
    Then the user should see "£40" price on the page


    







