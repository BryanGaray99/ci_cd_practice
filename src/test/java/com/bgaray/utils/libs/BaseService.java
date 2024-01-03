package com.bgaray.utils.libs;

import io.restassured.response.Response;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class BaseService {
    public static Response getEndpointResponse(String endpoint) {
        System.out.println(endpoint);
        Map<String, String> headers = createHeaders();
        return given().headers(headers).get(endpoint);
    }
    public static Map<String, String> createHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/json");
        return headers;
    }
    public static boolean isValidDateFormat(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
