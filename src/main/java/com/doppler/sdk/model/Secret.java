package com.doppler.sdk.model;

import lombok.Data;

@Data
public class Secret {
    private String key;
    private String value;
    private boolean sensitive;
}


