package com.sample.service;

import java.net.InetAddress;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("default")
public class SampleServiceImpl implements SampleService {

    @Value("${application.version}")
    private String appVersion;
    
    private String hostName;

    @Override
    public String getVersion() {
        return appVersion;
    }

    @Override
    public String getHostName() {
        try {
            hostName = InetAddress.getLocalHost().getHostName();
        } catch (Exception e) {
            //TODO: handle exception
        }
        return hostName;
    }

}