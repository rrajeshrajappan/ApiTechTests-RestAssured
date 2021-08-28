# ApiTechTests-RestAssured

# Requirement:
Using the API given below create an automated test with the listed acceptance criteria:

API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

Acceptance Criteria:

1. Name = "Carbon credits"
2. CanRelist = true
3. The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

#Solution overview: 
Automated the given requirements using Maven, Java RESTAssured library with TestNG framework and soution uploaded in git repository.

#project structure:
ApiTechTests-RestAssured/src/java/main --> All the test configurations and helper methods
ApiTechTests-RestAssured/src/java/test --> All the tests
ApiTechTests-RestAssured/pom.xml --> All the project dependencies and information 

#Clone the project: 
clone the project into your local using - 
git clone https://github.com/rrajeshrajappan/ApiTechTests-RestAssured.git

#How to run the tests
1. import the project into your IDE as Maven project
2. goto "ApiTechTests-RestAssured/src/test/java/apiTests/TechTests.java" class file --> run as TestNG tests or goto ApiTechTests-RestAssured/testNG.xml --> run as TestNG testsuite

#How it works: 
During test execution testng, look for the tests needs to be executed -> get the parmeters -> pass it to test methods -> call the reusable methods from helpers class ->execute the tests and do assertions -> generate the test results

#Analyze the test results
After run the tests refresh the project(only first time) and goto ApiTechTests-RestAssured/test-output --> open index.html in browser.
