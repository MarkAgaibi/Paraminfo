@smoke
  Feature: User Shall be able to add any product to his Shopping Cart

    Scenario: User shall add a product to his cart
      When User click on Add to Cart Button
      Then The selected product shall be added to the Shopping Cart and a success message shall appear as: The product has been added to your shopping cart