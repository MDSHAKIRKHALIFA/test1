$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("SignUp.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp for multicard",
  "description": "I want to signup for the wetsite",
  "id": "signup-for-multicard",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Scenario",
  "description": "",
  "id": "signup-for-multicard;successful-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I land on multicart landing page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I complete signup with shakir valid credentails",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I expect signup successfully",
  "keyword": "And "
});
formatter.match({
  "location": "SingnUp.i_open_browser_chrome()"
});
formatter.result({
  "duration": 1750236744,
  "status": "passed"
});
formatter.match({
  "location": "SingnUp.i_land_on_multicart_landing_page()"
});
formatter.result({
  "duration": 1336164621,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});