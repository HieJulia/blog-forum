package com.project.blogforum.config.other;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "blog.github")
public class GithubProperties {

    private String user;

    private String password;

    private String oAuth;

    private String repository;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getoAuth() {
        return oAuth;
    }

    public void setoAuth(String oAuth) {
        this.oAuth = oAuth;
    }

    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

}