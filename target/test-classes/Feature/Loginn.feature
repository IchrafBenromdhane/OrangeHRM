# Author: CSI
Feature: Orange HRM login page

  Background: 
    Given admin is on the login page

  Scenario: Login with valid credentials
    When admin enters the correct username "Admin" and correct password "admin123"
    Then admin is directed to the homepage with the title "Dashboard"

  Scenario: Login with invalid credentials
    When admin enters an incorrect username "ichraf" and correct password "admin123"
    Then admin remains on the login page with the error message "Invalid credentials"
