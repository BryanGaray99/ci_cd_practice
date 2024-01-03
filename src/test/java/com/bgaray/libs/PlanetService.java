package com.bgaray.libs;

import com.bgaray.pojos.Planet;
import com.bgaray.utils.libs.BaseService;
import io.restassured.response.Response;
import org.testng.Assert;

import static com.bgaray.libs.FilmService.getFirstPlanetEndpoint;
import static com.bgaray.utils.fixtures.DataToAssert.*;

/**
 * Service class for handling Planet-related operations.
 */
public class PlanetService extends BaseService {

    private static final String planetEndpoint = getFirstPlanetEndpoint();
    private static final Response response = getEndpointResponse(planetEndpoint);
    private static final Planet prevResPlanet = response.as(Planet.class);

    /**
     * Checks and asserts the gravity and terrain of the planet from the previous response.
     */
    public static void gravityTerrainPlanetCheck() {
        String gravity = prevResPlanet.getGravity();
        String terrains = prevResPlanet.getTerrain();

        Assert.assertEquals(gravity, EXPECTED_GRAVITY);
        Assert.assertEquals(terrains, EXPECTED_TERRAIN);
    }

    /**
     * Compares the information from the previous response with the information obtained from the planet URL.
     */
    public static void urlPrevResponsePlanetCheck() {
        String planetFromPrevRes = response.asString();
        System.out.println(planetFromPrevRes);

        String planetUrl = prevResPlanet.getUrl();
        String planetFromUrl = getEndpointResponse(planetUrl).asString();
        System.out.println(planetFromUrl);

        Assert.assertEquals(planetFromUrl, planetFromPrevRes);
    }
}
