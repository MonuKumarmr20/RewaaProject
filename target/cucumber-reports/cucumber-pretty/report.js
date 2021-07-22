$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("RewaaMoviesShowDashboard.feature");
formatter.feature({
  "line": 2,
  "name": "Covering positive test cases",
  "description": "In order to test dashboard",
  "id": "covering-positive-test-cases",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TestRewaaMoviesShowDashboardFeature"
    }
  ]
});
formatter.before({
  "duration": 2833196400,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User navigates to gmail URL",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on the Login page URL \"http://3.134.135.231:4000/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I should see \"angular-starter\" on Page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://3.134.135.231:4000/",
      "offset": 28
    }
  ],
  "location": "RewaaStepDefinitions.launchAddress(String)"
});
formatter.result({
  "duration": 3509218900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "angular-starter",
      "offset": 14
    }
  ],
  "location": "RewaaStepDefinitions.assertLoginPage(String)"
});
formatter.result({
  "duration": 3084307300,
  "status": "passed"
});
formatter.scenario({
  "line": 67,
  "name": "validate user is able to add sub movie into list",
  "description": "",
  "id": "covering-positive-test-cases;validate-user-is-able-to-add-sub-movie-into-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 66,
      "name": "@verifyCreateOperation"
    }
  ]
});
formatter.step({
  "line": 68,
  "name": "I perform search for \"Abraham Lincoln\"",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "I click on movie name \"Abraham Lincoln\"",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "I click on crud option \"fas fa-plus\"",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "I enter \"Forrest Gump\" into Name field",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "I enter \"Forrest Gump\" into file name field",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "I enter \"23/06/1994\" into release date field",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "I enter \"Forrest Gump\" into wikipedia field",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "I click on crud option \"fas fa-save\"",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "I see movie id get generated",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Abraham Lincoln",
      "offset": 22
    }
  ],
  "location": "RewaaStepDefinitions.performSearch(String)"
});
formatter.result({
  "duration": 3262943500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abraham Lincoln",
      "offset": 23
    }
  ],
  "location": "RewaaStepDefinitions.performClickOnMovieName(String)"
});
formatter.result({
  "duration": 3086813800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fas fa-plus",
      "offset": 24
    }
  ],
  "location": "RewaaStepDefinitions.performClickOnCrudOption(String)"
});
formatter.result({
  "duration": 71778100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Forrest Gump",
      "offset": 9
    }
  ],
  "location": "RewaaStepDefinitions.enterValueIntoNameField(String)"
});
formatter.result({
  "duration": 157500400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Forrest Gump",
      "offset": 9
    }
  ],
  "location": "RewaaStepDefinitions.enterValueIntoFileNameField(String)"
});
formatter.result({
  "duration": 110612500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "23/06/1994",
      "offset": 9
    }
  ],
  "location": "RewaaStepDefinitions.enterValueIntoReleaseDateField(String)"
});
formatter.result({
  "duration": 101271900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Forrest Gump",
      "offset": 9
    }
  ],
  "location": "RewaaStepDefinitions.enterValueIntoWikiPediaField(String)"
});
formatter.result({
  "duration": 158412500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "fas fa-save",
      "offset": 24
    }
  ],
  "location": "RewaaStepDefinitions.performClickOnCrudOption(String)"
});
formatter.result({
  "duration": 93635300,
  "status": "passed"
});
formatter.match({
  "location": "RewaaStepDefinitions.assertMovieIdGetGenerated()"
});
formatter.result({
  "duration": 5041238500,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1545615900,
  "status": "passed"
});
});