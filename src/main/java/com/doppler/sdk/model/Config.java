package com.doppler.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Config {
    private String name;
    private String slug;
    private String project;

    @JsonProperty("created_at")
    private String createdAt;
}
