# CI Practice with Jenkins

This repository contains Java tests using RestAssured to interact with the Star Wars API (swapi). The tests are organized following a structured framework architecture, utilizing POJOs for better code organization and reusability.

## Jenkins Pipeline

### Stages:

1. **Clone and Fetch:**
   - This stage clones the project repository and fetches the latest changes.
   - Uses Git to clone the repository and fetch updates.

2. **Compile:**
   - This stage compiles the project, ensuring dependencies are resolved.
   - Executes Maven with the `clean` and `package` goals to compile and package the project.
   - Skips tests during this stage.

3. **Execute Tests:**
   - This stage runs the test suite with parameters (suites can be: FilmSuite or PeopleSuite, and url is a single parameter).
   - Executes Maven with the `test` goal, passing parameters for the base URL and test suite file.
   - Uses the Allure plugin to generate test reports.

### Parameters:

- **url:**
   - *Type:* String
   - *Default Value:* 'https://swapi.dev/api'
   - *Description:* Base URL for testing.

- **suiteName:**
   - *Type:* String
   - *Default Value:* 'PeopleSuite.xml'
   - *Description:* Test Suite file name (options: FilmSuite.xml or PeopleSuite.xml).

## Jenkins Pipeline Setup:

To set up this project in Jenkins and run the pipeline, follow these steps:

1. **Install Required Tools:**
   - Ensure that Jenkins has the necessary tools installed.
      - Maven: Install Maven on the Jenkins server and configure it in Jenkins Global Tool Configuration.
      - Allure: Install Allure command-line tools on the Jenkins server.

2. **Create a New Pipeline Job:**
   - In Jenkins, create a new pipeline job.

3. **Configure Pipeline:**
   - In the pipeline configuration, select the definition of the Pipeline: "Pipeline script from SCM"
   - Select Git and paste this repository URL: https://github.com/BryanGaray99/ci_cd_practice.git
   - In Branch Specifier section ensure to have: */main
   - Script Path: jenkins/Jenkinsfile

4. **Run Pipeline:**
   - Save the pipeline configuration and run the pipeline job.

6. **View Allure Reports:**
   - After the pipeline completes, access the Allure reports generated in the workspace.

## API Information

- Base URL: [https://swapi.dev/](https://swapi.dev/)

## Test Scenarios

1. **People/2/ Endpoint Test:**
   - *Description:* Tests the `people/2/` endpoint.
   - *Actions:*
      - Check for a successful response.
      - Verify that the skin color is gold.
      - Confirm that the character appears in 6 films.

2. **Second Film From People/2/ Endpoint Test:**
   - *Description:* Tests the endpoint of the second movie in which `people/2/` was present.
   - *Actions:*
      - Check the release date in the correct format.
      - Verify that the response includes characters, planets, starships, vehicles, and species, each with more than 1 element.

3. **First Planet From Last Film's Response Test:**
   - *Description:* Tests the endpoint of the first planet present in the last film's response.
   - *Actions:*
      - Check the gravity and terrains, ensuring they match the exact values returned by the request (using fixtures for data storage).
      - Grab the URL element from the response and request it.
      - Validate that the response is exactly the same as the previous one.

4. **Film/7/ Endpoint Test:**
   - *Description:* Tests the `/films/7/` endpoint.
   - *Actions:*
      - Check that the response has a 404 status code.

## How to Run Tests

Ensure you have the necessary dependencies and configurations set up for your test environment. Run the individual test classes based on the specific scenario you want to test or run all the test cases with the suite.xml.

Feel free to customize or extend the tests as needed for your use case.

### Author: Bryan Garay
### Email: bryangarayacademico@gmail.com
