package app.taxi.com.taxi.Common;

import app.taxi.com.taxi.Remote.IGoogleAPI;
import app.taxi.com.taxi.Remote.RetrofitClient;

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI()
    {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
