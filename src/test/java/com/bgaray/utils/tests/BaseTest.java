package com.bgaray.utils.tests;

import com.bgaray.utils.fixtures.EndpointConfig;
import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class BaseTest {
    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = EndpointConfig.BASE_URL;
    }
}
