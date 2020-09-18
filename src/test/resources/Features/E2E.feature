Feature: Login1

   

  #Then Verifies user logged in successfuly
  #And click on the logot button
  #Then Verifies user logout successfully
  Scenario: Verifies invalid login functionalies
   Given user launch the application "https://admin-demo.nopcommerce.com"
    And Enter the username "admin@yourstore.com"
    And Enter the password "admin"
    When Click on the login button
    Given user not launch the application "https://admin-demo.nopcommerce.com"
    #And Enter the username "admin@yourstore.com"
    #And Enter the password "admin"
    #When Click on the login button
    #Then Verifies user logged in successfuly
    #And click on the logot button
    #Then Verifies user logout successfully
