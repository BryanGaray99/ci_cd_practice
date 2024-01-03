package com.bgaray.libs;

import com.bgaray.pojos.People;
import com.bgaray.utils.fixtures.EndpointConfig;
import com.bgaray.utils.libs.BaseService;
import io.restassured.response.Response;
import org.testng.Assert;

import static com.bgaray.utils.fixtures.DataToAssert.*;

/**
 * Service class for handling People-related operations.
 */
public class PeopleService extends BaseService {

    private static final String peopleEndpoint = EndpointConfig.BASE_URL + EndpointConfig.GET_PEOPLE + "/2/";
    private static final Response response = getEndpointResponse(peopleEndpoint);
    private static final People people = response.as(People.class);

    /**
     * Checks and asserts information about the people retrieved from the API.
     */
    public static void checkPeopleInformation() {
        // Assertions
        Assert.assertEquals(response.statusCode(), SUCCESS_GET_STATUS_CODE);
        Assert.assertEquals(people.getSkinColor(), EXPECTED_SKIN_COLOR);
        Assert.assertEquals(people.getFilms().size(), EXPECTED_FILM_QUANTITY);
    }

    /**
     * Retrieves the endpoint for the second movie associated with the people.
     *
     * @return The endpoint for the second movie.
     */
    public static String getSecondMovieEndpoint() {
        return people.getFilms().get(1);
    }
}
