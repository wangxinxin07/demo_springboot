package com.wxx.demo.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author wangxinxin07
 * @date 2020/1/29
 */
@Data
@Configuration
@PropertySource(value = "classpath:jdbc.properties")
@ConfigurationProperties(prefix = "com.jdbc")
public class Resource {

    private String url;

    private String userName;

    private String password;

    private String driver;

}
