package com.bgaray.pojos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {
    @JsonProperty("gravity")
    private String gravity;
    @JsonProperty("terrain")
    private String terrain;
    @JsonProperty("url")
    private String url;

    public String getGravity() {
        return gravity;
    }
    public String getTerrain() {
        return terrain;
    }
    public String getUrl() {
        return url;
    }

}
