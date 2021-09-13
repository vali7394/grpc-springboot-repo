package com.grpc.boot.example.controller;

import com.grpc.boot.example.service.FoobarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class TestController implements CommandLineRunner {

    @Autowired
    FoobarService foobarService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(foobarService.receiveGreeting("Bhavni"));
    }
}
