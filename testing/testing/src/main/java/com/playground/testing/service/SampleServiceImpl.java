package com.playground.testing.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    @Override
    public String getName() {
        return "Service";
    }

    @Override
    public Integer getNumber() {
        return 100;
    }
}
