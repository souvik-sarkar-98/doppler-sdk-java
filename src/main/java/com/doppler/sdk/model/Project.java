package com.doppler.sdk.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Project {
    private String id;
    private String name;
    private String description;

    @JsonProperty("created_at")
    private String createdAt;
}
