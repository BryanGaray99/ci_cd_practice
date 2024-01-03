package com.bgaray.tests;

import com.bgaray.libs.FilmService;
import com.bgaray.utils.tests.BaseTest;
import org.testng.annotations.Test;

public class NotFoundFilmTest extends BaseTest {
    @Test
    public void notFoundFilmTest() {
        FilmService.checkFilm7();
    }
}
