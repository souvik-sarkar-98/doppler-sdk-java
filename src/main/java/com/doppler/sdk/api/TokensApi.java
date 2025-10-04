package com.doppler.sdk.api;

import com.doppler.sdk.DopplerClient;
import com.doppler.sdk.model.Token;

public class TokensApi {
    private final DopplerClient client;

    public TokensApi(DopplerClient client) {
        this.client = client;
    }

    public Token[] listTokens(String project, String config) throws Exception {
        String path = String.format("/v3/configs/config/tokens?project=%s&config=%s", project, config);
        return client.get(path, Token[].class);
    }
}
