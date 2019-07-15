$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "  Test the login functionality of the application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@loginFeature"
    }
  ]
});
formatter.scenario({
  "name": "Test the login functionality of EA application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@loginFeature"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I navigate to the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.navigateToLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the following for Login",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin",
        "adminpassword"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.enterLoginUsingTables(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.homePage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("Include/features/UserForm.feature");
formatter.feature({
  "name": "Fill User Form",
  "description": "  Test the User Form functionality",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@fillUserForm"
    }
  ]
});
formatter.scenario({
  "name": "Test the User Form functionality of EA application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@fillUserForm"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I navigate to the User Form page",
  "keyword": "Given "
});
formatter.match({
  "location": "FillUserForm.navigateToUserForm()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a Title",
  "keyword": "And "
});
formatter.match({
  "location": "FillUserForm.selectTitle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I type Initial and First Name and Middle Name",
  "keyword": "And "
});
formatter.match({
  "location": "FillUserForm.typeNames()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select a Gender",
  "keyword": "And "
});
formatter.match({
  "location": "FillUserForm.selectGender()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Languages Known",
  "keyword": "And "
});
formatter.match({
  "location": "FillUserForm.selectLanguage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "FillUserForm.clickSave()"
});
formatter.result({
  "status": "passed"
});
});