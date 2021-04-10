package com.gvdw.spring_rest_api.services;

import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created By Gullian on Apr, 2021
 */
@FeignClient(name = "api-service")
public interface apiServiceProxy extends apiService{
}
