package app.taxi.com.taxi.Remote;

import app.taxi.com.taxi.Model.FCMResponse;
import app.taxi.com.taxi.Model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface IFCMService {
    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAApEOFjy4:APA91bGhKQNPrRLh5ycCvqohhGeNB5YQDGZbk-_k4_MyUU2egiz62FkJWP1ztD4abCB0srIY8CO0omDXQVVJqmlfLRPZUG1S6qRKG3FSvZ0Z1HnGMl8Ic1GYWk8KDPo-JproZ4FTMGH2"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
