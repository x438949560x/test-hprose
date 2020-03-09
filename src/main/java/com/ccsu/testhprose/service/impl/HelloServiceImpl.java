package com.ccsu.testhprose.service.impl;

import com.ccsu.testhprose.service.HelloService;
import org.springframework.stereotype.Service;

@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    @Override
    public String sayBye(String name) {
        return "Bye " + name;
    }
}
