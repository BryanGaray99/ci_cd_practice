package com.bgaray.tests;

import com.bgaray.libs.PeopleService;
import com.bgaray.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class People2Test extends BaseTest {
    @Test
    public void people2EndpointTest() {
        PeopleService.checkPeopleInformation();
    }
}
