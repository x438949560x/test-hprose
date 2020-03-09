package com.ccsu.testhprose.servlet;

import com.ccsu.testhprose.service.HelloService;
import hprose.common.HproseMethods;
import hprose.server.HproseServlet;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/api/test/hprose"})
public class HproseServletDemo extends HproseServlet {
    @Autowired
    private HelloService helloService;

    @Override
    protected void setGlobalMethods(HproseMethods methods) {
        super.setGlobalMethods(methods);
        methods.addInstanceMethods(helloService);
    }
}
