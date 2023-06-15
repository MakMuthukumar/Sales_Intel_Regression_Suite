$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/New_UI_View/TC_01_Data_Driver_Testing.feature");
formatter.feature({
  "name": "Data Driver testing",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login logout with different credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@First"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Data"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.launch_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Test the Login and Logout with all Valid and Invalid Credentials available in the Sheet",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.I_Test_the_Login_and_Logout_with_all_Valid_and_Invalid_Credentials_available_in_the_Sheet()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});