Feature: LoginPage

Background: 
Given Admin is on loginPage

Scenario: Login with valid Credentials

When Admin enter correct userName "Admin" and Password "admin123"

Then Admin is directed to HomePage "Dashboard"

Scenario: Login With Invalid credentials

When Admin enter incorrect userName "Arij" and Password "test"

Then Admin still on login page that contains message "Invalid credentials"