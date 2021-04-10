package com.gvdw.spring_rest_api.controllers;

import com.gvdw.spring_rest_api.services.apiService;
import com.gvdw.spring_rest_api.services.apiServiceProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created By Gullian on Apr, 2021
 */

@org.springframework.web.bind.annotation.RestController
@EnableFeignClients(basePackageClasses = apiServiceProxy.class)
public class RestController implements apiService {

    private apiServiceProxy apiServiceProxy;

    public RestController(com.gvdw.spring_rest_api.services.apiServiceProxy apiServiceProxy) {
        this.apiServiceProxy = apiServiceProxy;
    }

    @Autowired
    private RestTemplate restTemplate;

    @Override
    @GetMapping("/rest/v2/all")
    public List<Object> getCountries() {
        return apiServiceProxy.getCountries();
    }


//    private static String url = "https://restcountries.eu/rest/v2/all";
//
//    @GetMapping("/countries")
//    public List<Object> getCountries(){
//        Object[] countries = restTemplate.getForObject(url, Object[].class);
//        assert countries != null;
//        return Arrays.asList(countries);
//    }


}
