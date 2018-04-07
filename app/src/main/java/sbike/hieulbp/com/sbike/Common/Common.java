package sbike.hieulbp.com.sbike.Common;

import retrofit2.Retrofit;
import sbike.hieulbp.com.sbike.Remote.IGoogleAPI;
import sbike.hieulbp.com.sbike.Remote.RetrofitClient;

/**
 * Created by hieulbp on 3/28/18.
 */

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";
    public static IGoogleAPI getGoogleAPI(){
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
