package com.doppler.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Environment {
    private String id;
    private String name;

    @JsonProperty("created_at")
    private String createdAt;

    private String project;
}
