package com.gemalto.dexxis.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class TestController {
	
    @Value("${from}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }
    
    @Value("${user}")
    private String user;

	@RequestMapping("/user")
    public String user() {
        return this.user;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }

    public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
    
}