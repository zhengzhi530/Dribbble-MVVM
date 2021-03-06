package com.adgvcxz.adgble.api;

import com.adgvcxz.adgble.content.Comment;
import com.adgvcxz.adgble.content.Shot;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * zhaowei
 * Created by zhaowei on 2016/10/10.
 */

public interface ApiService {


    int PageNumber = 20;

    String ClientId = "ff29cefaeb3df7e915e21af05c393af4294742c563dd9c705d0f70636560c93d";
    String ClientSecret = "15b88962e2e90aec8593641272583f990c6fe4e3e284cbd936d60c332b6070dc";
    String ClientAccessToken = "96b9b0242263b69c9f9227262252b48649e1b7c16edd2bb93fc79fb2c685b362";


    @GET("shots")
    Observable<List<Shot>> getShots(@Query("page") int page, @Query("per_page") int number, @Query("sort") String sort);

    @GET("shots/{shot}/comments")
    Observable<List<Comment>> getComments(@Path("shot") long id, @Query("page") int page, @Query("per_page") int number);
}
