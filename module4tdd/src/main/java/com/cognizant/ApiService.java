package com.cognizant;

public class ApiService {

    private ExternalApi externalApi;

    public ApiService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String fetchData() {
        return externalApi.getData();
    }
}
