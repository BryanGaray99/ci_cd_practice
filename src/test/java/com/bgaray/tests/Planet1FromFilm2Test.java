package com.bgaray.tests;

import com.bgaray.libs.PlanetService;
import com.bgaray.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class Planet1FromFilm2Test extends BaseTest {
    @Test
    public void firstPlanetPrevResTest() {
        PlanetService.gravityTerrainPlanetCheck();
    }

    @Test
    public void urlPrevResponsePlanetTest() {
        PlanetService.urlPrevResponsePlanetCheck();
    }
}
