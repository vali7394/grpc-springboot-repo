package com.grpc.boot.example.service;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.grpc.boot.example.HelloRequest;
import org.grpc.boot.example.MyServiceGrpc;
import org.springframework.stereotype.Service;

@Service
public class FoobarService {
    ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
            .usePlaintext()
            .build();

    private MyServiceGrpc.MyServiceBlockingStub myServiceStub = MyServiceGrpc.newBlockingStub(channel);

    public String receiveGreeting(String name) {
        HelloRequest request = HelloRequest.newBuilder()
                .setName(name)
                .build();
        return myServiceStub.sayHello(request).getMessage();
    }
}
