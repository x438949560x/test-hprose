package com.ccsu.testhprose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * 启动器启动时，扫描本目录以及子目录带有的webservlet注解的
 */
@ServletComponentScan
@SpringBootApplication
public class TestHproseApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestHproseApplication.class, args);
    }

}
