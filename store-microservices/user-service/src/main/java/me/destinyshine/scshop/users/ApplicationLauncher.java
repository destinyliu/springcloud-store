package me.destinyshine.scshop.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author destinyliu
 */
@EnableAutoConfiguration
@SpringBootApplication
@EnableOAuth2Sso
@EnableZuulProxy
public class ApplicationLauncher {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationLauncher.class, args);
    }
}
