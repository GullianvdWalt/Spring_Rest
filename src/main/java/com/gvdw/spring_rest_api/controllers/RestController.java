package com.gvdw.spring_rest_api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

/**
 * Created By Gullian on Apr, 2021
 */

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private RestTemplate restTemplate;

    private static String url = "https://restcountries.eu/rest/v2/all";

    @GetMapping("/countries")
    public List<Object> getCountries(){
        Object[] countries = restTemplate.getForObject(url, Object[].class);
        assert countries != null;
        return Arrays.asList(countries);
    }
}
