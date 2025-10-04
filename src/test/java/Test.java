import com.doppler.sdk.DopplerClient;
import com.doppler.sdk.api.ConfigsApi;
import com.doppler.sdk.model.Secret;

import java.util.List;

public class Test {
    public static void main(String[] args) throws Exception {

        ConfigsApi api = new ConfigsApi(new DopplerClient(""));
        List<Secret> val =api.getSecrets("", "");
        for(Secret s: val) {
            System.out.println(s.getKey() + " : " + s.getValue() + " : " + s.isSensitive());
        }
    }
}
