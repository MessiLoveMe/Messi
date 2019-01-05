package com.mxw.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * 配置文件默认的名字是application.properties,默认的位置是classpath或者是classpath://config文件下
 */
@Component
public class UserConfig {
    @Value("${local.port}")
    private String localPort;

    @Value("${local.port}")
    private Integer localPort2;

    @Value("${tomcat.port:8090}")
    private String tomcatPort;

    @Autowired
    private Environment env;

    public void show(){
        System.out.println("local.ip="+env.getProperty("local.ip"));
        System.out.println("local.Port="+localPort);
        System.out.println("local.port2="+localPort2);
        System.out.println("name="+env.getProperty("name"));
        System.out.println("app.name="+env.getProperty("app.name"));
        System.out.println("a");
        System.out.println("tomcat.port="+tomcatPort);
    }
}
