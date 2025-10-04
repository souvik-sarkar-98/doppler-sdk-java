package com.doppler.sdk.api;

import com.doppler.sdk.DopplerClient;
import com.doppler.sdk.model.Environment;

public class EnvironmentsApi {
    private final DopplerClient client;

    public EnvironmentsApi(DopplerClient client) {
        this.client = client;
    }

    public Environment getEnvironment(String project, String environment) throws Exception {
        String path = "/v3/environments/environment?project=" + project + "&environment=" + environment;
        return client.get(path, Environment.class);
    }

    public Environment[] listEnvironments(String project) throws Exception {
        String path = "/v3/environments?project=" + project;
        return client.get(path, Environment[].class);
    }
}
