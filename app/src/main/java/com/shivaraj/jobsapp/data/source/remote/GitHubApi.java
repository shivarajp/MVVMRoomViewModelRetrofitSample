package com.shivaraj.jobsapp.data.source.remote;


import android.arch.lifecycle.LiveData;
import com.shivaraj.jobsapp.data.source.local.JobModel;
import com.shivaraj.jobsapp.utils.ApiResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface GitHubApi {

    @GET("positions.json?")
    LiveData<ApiResponse<List<JobModel>>> browseRepoLiveData(@Query("page")  int pageNumber);

}
