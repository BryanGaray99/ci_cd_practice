package com.bgaray.libs;

import com.bgaray.pojos.Film;
import com.bgaray.utils.libs.BaseService;
import io.restassured.response.Response;
import org.testng.Assert;

import java.text.ParseException;

import static com.bgaray.libs.PeopleService.getSecondMovieEndpoint;
import static com.bgaray.utils.fixtures.DataToAssert.*;
import static com.bgaray.utils.fixtures.EndpointConfig.*;

/**
 * Service class for handling Film-related operations.
 */
public class FilmService extends BaseService {

    private static final String filmEndpoint = getSecondMovieEndpoint();
    private static final Response response = getEndpointResponse(filmEndpoint);
    private static final Film film = response.as(Film.class);
    private static final String film7Endpoint = BASE_URL + GET_FILM_7;
    private static final Response film7Response = getEndpointResponse(film7Endpoint);

    /**
     * Validates the response for the second film and performs assertions on different attributes.
     *
     * @throws ParseException If there is an issue parsing the release date.
     */
    public static void secondFilmPrevRes() throws ParseException {
        Assert.assertEquals(response.getStatusCode(), SUCCESS_GET_STATUS_CODE);

        System.out.println("Release Date: " + film.getReleaseDate());
        Assert.assertTrue(isValidDateFormat(film.getReleaseDate()));

        System.out.println("Number of Characters: " + film.getCharacters().size());
        Assert.assertTrue(film.getCharacters().size() > 1);

        System.out.println("Number of Planets: " + film.getPlanets().size());
        Assert.assertTrue(film.getPlanets().size() > 1);

        System.out.println("Number of Starships: " + film.getStarships().size());
        Assert.assertTrue(film.getStarships().size() > 1);

        System.out.println("Number of Vehicles: " + film.getVehicles().size());
        Assert.assertTrue(film.getVehicles().size() > 1);

        System.out.println("Number of Species: " + film.getSpecies().size());
        Assert.assertTrue(film.getSpecies().size() > 1);
    }

    /**
     * Checks the response for the seventh film and asserts that it returns a not found status code.
     */
    public static void checkFilm7() {
        System.out.println(film7Response.getStatusCode());
        Assert.assertEquals(film7Response.getStatusCode(), NOT_FOUND_STATUS_CODE);
    }

    /**
     * Retrieves the endpoint for the first planet in the film.
     *
     * @return The endpoint for the first planet.
     */
    public static String getFirstPlanetEndpoint() {
        return film.getPlanets().get(0);
    }

}