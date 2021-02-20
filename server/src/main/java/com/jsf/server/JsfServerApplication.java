package com.jsf.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName JsfServerApplication
 * @Description
 * @Author caicw
 * @Date 2021/2/20 19:09
 */
@ComponentScan(basePackages = {"com.jsf"})
@SpringBootApplication
public class JsfServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(JsfServerApplication.class, args);

        System.out.println("java rapid development framework start success...");
    }
}
