# ApiTechTests-RestAssured

# Requirement:
Using the API given below create an automated test with the listed acceptance criteria:

API = https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false

Acceptance Criteria:

1. Name = "Carbon credits"
2. CanRelist = true
3. The Promotions element with Name = "Gallery" has a Description that contains the text "Good position in category"

#Solution overview: 
Automated the given requirements using Maven, Java RESTAssured library with TestNG reporting. Project structure is,
src/java/main --> got all the test configurations and helper methods
src/java/test --> got all the tests
pom.xml --> got all the project information with dependency details

#Clone the project: 
clone the project into your local using - 
git clone https://github.com/rrajeshrajappan/ApiTechTests-RestAssured.git

#How to run the tests
1. import the project into your IDE as Maven project
2. goto "ApiTechTests-RestAssured/src/test/java/apiTests/TechTests.java" class file --> run as TestNG tests or

goto ApiTechTests-RestAssured/testNG.xml --> run as TestNG testsuite

#Analyze the test results
goto ApiTechTests-RestAssured/test-output --> open index.html in browser


#Note: 
this solution can be extended with cucumber BDD framework or Spring   
