package com.project.blogforum.config.other;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Component
@ConfigurationProperties(prefix = "blog.twitter")
public class TwitterProperties {

    private String user;

    private String dataWidgetId;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getDataWidgetId() {
        return dataWidgetId;
    }

    public void setDataWidgetId(String dataWidgetId) {
        this.dataWidgetId = dataWidgetId;
    }
}
