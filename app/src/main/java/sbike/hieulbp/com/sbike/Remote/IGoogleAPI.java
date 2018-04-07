package sbike.hieulbp.com.sbike.Remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

/**
 * Created by hieulbp on 3/28/18.
 */

public interface IGoogleAPI {
    @GET
    Call<String> getPath(@Url String url);

}
