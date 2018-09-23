package com.miao.rmiserver.config;

import api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

@Configuration
public class RpcConfig
{

    @Autowired
    private UserService userService;

    @Bean
    public RmiServiceExporter rmiServiceExporter(){
        RmiServiceExporter rmi = new RmiServiceExporter();
        rmi.setService(userService);
        rmi.setServiceName("userService");
        rmi.setServiceInterface(UserService.class);
        rmi.setRegistryPort(8090);
        rmi.setServicePort(8091);
        return rmi;
    }
}
