package com.doppler.sdk.api;

import com.doppler.sdk.DopplerClient;
import com.doppler.sdk.model.Project;

public class ProjectsApi {
    private final DopplerClient client;

    public ProjectsApi(DopplerClient client) {
        this.client = client;
    }

    public Project getProject(String project) throws Exception {
        String path = "/v3/projects/project?project=" + project;
        return client.get(path, Project.class);
    }

    public Project[] listProjects() throws Exception {
        String path = "/v3/projects?page=1&per_page=50";
        return client.get(path, Project[].class);
    }
}
