$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/paku0817/workspace/com.qa.regression/src/main/java/feature/TFNURG-68737.feature");
formatter.feature({
  "line": 1,
  "name": "perform payment on prepaid BCA customer",
  "description": "",
  "id": "perform-payment-on-prepaid-bca-customer",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "payment to prepaid BCA customer",
  "description": "",
  "id": "perform-payment-on-prepaid-bca-customer;payment-to-prepaid-bca-customer",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user logged in with BCA customer",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "customer should have existing prepaid offer and BA",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user navigate to BA page",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user click on payment tab",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user click on new payment button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters the amount and click on create button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "payment should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "TFNURG_68729_StepDef.user_logged_in_with_BCA_customer()"
});
formatter.result({
  "duration": 26408327854,
  "status": "passed"
});
formatter.match({
  "location": "TFNURG_68729_StepDef.customer_should_have_existing_prepaid_offer_and_BA()"
});
formatter.result({
  "duration": 8368953543,
  "status": "passed"
});
formatter.match({
  "location": "TFNURG_68729_StepDef.user_navigate_to_BA_page()"
});
formatter.result({
  "duration": 16664001724,
  "status": "passed"
});
formatter.match({
  "location": "TFNURG_68729_StepDef.user_click_on_payment_tab()"
});
formatter.result({
  "duration": 60375,
  "status": "passed"
});
formatter.match({
  "location": "TFNURG_68729_StepDef.user_click_on_new_payment_button()"
});
formatter.result({
  "duration": 286478,
  "status": "passed"
});
formatter.match({
  "location": "TFNURG_68729_StepDef.user_enters_the_amount_and_click_on_create_button()"
});
formatter.result({
  "duration": 64299,
  "status": "passed"
});
formatter.match({
  "location": "TFNURG_68729_StepDef.payment_should_be_created()"
});
formatter.result({
  "duration": 39243,
  "status": "passed"
});
});