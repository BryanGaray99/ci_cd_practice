package com.bgaray.tests;

import com.bgaray.libs.FilmService;
import com.bgaray.utils.tests.BaseTest;
import org.testng.annotations.Test;

import java.text.ParseException;

public class Film1FromPeople2Test extends BaseTest {
    @Test
    public void secondFilmPrevResTest() {
        try {
            FilmService.secondFilmPrevRes();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
