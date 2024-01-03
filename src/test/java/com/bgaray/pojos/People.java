package com.bgaray.pojos;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class People {
    @JsonProperty("name")
    private String name;

    @JsonProperty("skin_color")
    private String skinColor;

    @JsonProperty("films")
    private List<String> films;

    public String getSkinColor() {
        return skinColor;
    }

    public List<String> getFilms() {
        return films;
    }

}
