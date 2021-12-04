$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/optiseller/resources/featurefiles/signin.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In Functionality",
  "description": "As a user\r\nI want to sign in on optiseller website",
  "id": "sign-in-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 16591935200,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Verify user should navigate to login page",
  "description": "",
  "id": "sign-in-functionality;verify-user-should-navigate-to-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I am on Optiseller Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Sign In button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should be in Sign In page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.iAmOnOptisellerHomePage()"
});
formatter.result({
  "duration": 536321000,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.iClickOnSignInButton()"
});
formatter.result({
  "duration": 5444789000,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.iShouldBeInSignInPage()"
});
formatter.result({
  "duration": 106621400,
  "status": "passed"
});
formatter.after({
  "duration": 1081170300,
  "status": "passed"
});
formatter.before({
  "duration": 10037665900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Verify user should not Sign In with invalid credentials",
  "description": "",
  "id": "sign-in-functionality;verify-user-should-not-sign-in-with-invalid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on Optiseller Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter email Address \"xyz12@gmail.com\" on email field",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I enter password \"Acd123456@\" on Password field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I click Sign In button",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "System should show an error message",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.iAmOnOptisellerHomePage()"
});
formatter.result({
  "duration": 396441700,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.iClickOnSignInButton()"
});
formatter.result({
  "duration": 3757531400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz12@gmail.com",
      "offset": 23
    }
  ],
  "location": "SignInTest.iEnterEmailAddressOnEmailField(String)"
});
formatter.result({
  "duration": 199049300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Acd123456@",
      "offset": 18
    }
  ],
  "location": "SignInTest.iEnterPasswordOnPasswordField(String)"
});
formatter.result({
  "duration": 191819100,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.iClickSignInButton()"
});
formatter.result({
  "duration": 347126200,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.systemShouldShowAnErrorMessage()"
});
formatter.result({
  "duration": 2159182700,
  "status": "passed"
});
formatter.after({
  "duration": 2111903700,
  "status": "passed"
});
});