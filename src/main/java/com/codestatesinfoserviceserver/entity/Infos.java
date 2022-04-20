package com.codestatesinfoserviceserver.entity;

public class Infos {

    private String name;

    private String job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Infos(String name, String job) {
        this.name = name;
        this.job = job;
    }
}
