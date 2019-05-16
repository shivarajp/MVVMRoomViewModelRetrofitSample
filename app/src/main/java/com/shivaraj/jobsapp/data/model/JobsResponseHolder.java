package com.shivaraj.jobsapp.data.model;

import com.shivaraj.jobsapp.data.source.local.JobModel;

import java.util.List;

public class JobsResponseHolder {
    final private int page;
    final private List<JobModel> list;

    public JobsResponseHolder(int page, List<JobModel> list) {
        this.page = page;
        this.list = list;
    }

    public int getPage() {
        return page;
    }

    public List<JobModel> getList() {
        return list;
    }
}
