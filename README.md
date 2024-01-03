# RestAssured Practice

This repository contains Java tests using RestAssured to interact with the Star Wars API (swapi). The tests are organized following a structured framework architecture, utilizing POJOs for better code organization and reusability.

## API Information

- Base URL: [https://swapi.dev/](https://swapi.dev/)

## Test Scenarios

1. **People/2/ Endpoint Test**
    - **Description:** Tests the `people/2/` endpoint.
    - **Actions:**
        - Check for a successful response.
        - Verify that the skin color is gold.
        - Confirm that the character appears in 6 films.

2. **Second Film From People/2/ Endpoint Test**
    - **Description:** Tests the endpoint of the second movie in which `people/2/` was present.
    - **Actions:**
        - Check the release date in the correct format.
        - Verify that the response includes characters, planets, starships, vehicles, and species, each with more than 1 element.

3. **First Planet From Last Film's Response Test**
    - **Description:** Tests the endpoint of the first planet present in the last film's response.
    - **Actions:**
        - Check the gravity and terrains, ensuring they match the exact values returned by the request (using fixtures for data storage and comparison).
        - Grab the URL element from the response and request it.
        - Validate that the response is exactly the same as the previous one.

4. **Film/7/ Endpoint Test**
    - **Description:** Tests the `/films/7/` endpoint.
    - **Actions:**
        - Check that the response has a 404 status code.

## Test Classes

1. **Film1FromPeople2Test**
    - **Description:** Test class for scenarios related to the `people/2/` endpoint and the second film.
    - **Tests:**
        - `secondFilmPrevResTest`: Executes the second film test, checking various attributes.

2. **NotFoundFilmTest**
    - **Description:** Test class for scenarios related to the `/films/7/` endpoint.
    - **Tests:**
        - `notFoundFilmTest`: Executes the test for a not found film, checking for a 404 status code.

3. **People2Test**
    - **Description:** Test class for scenarios related to the `people/2/` endpoint.
    - **Tests:**
        - `people2EndpointTest`: Executes the test for the `people/2/` endpoint, checking various attributes.

4. **Planet1FromFilm2Test**
    - **Description:** Test class for scenarios related to the first planet from the last film's response.
    - **Tests:**
        - `firstPlanetPrevResTest`: Executes the test for the first planet, checking gravity and terrains.
        - `urlPrevResponsePlanetTest`: Executes the test for the URL element from the planet's response, validating it matches the previous response.

## How to Run Tests

Ensure you have the necessary dependencies and configurations set up for your test environment. Run the individual test classes based on the specific scenario you want to test. Or run all the test cases with the suite.xml

Feel free to customize or extend the tests as needed for your use case.

### Author: Bryan Garay
### Email: bryangarayacademico@gmail.com