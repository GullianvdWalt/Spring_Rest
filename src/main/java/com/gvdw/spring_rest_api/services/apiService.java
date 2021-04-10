package com.gvdw.spring_rest_api.services;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Created By Gullian on Apr, 2021
 */
public interface apiService {

    @GetMapping("/rest/v2/all")
    public List<Object> getCountries();

}
