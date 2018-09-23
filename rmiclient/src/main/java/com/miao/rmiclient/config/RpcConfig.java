package com.miao.rmiclient.config;


import api.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

@Configuration
public class RpcConfig
{
    @Bean
    public RmiProxyFactoryBean userService(){
        RmiProxyFactoryBean rmiProxyFactory = new RmiProxyFactoryBean();

        rmiProxyFactory.setServiceUrl("rmi://127.0.0.1:8090/userService");

        rmiProxyFactory.setServiceInterface(UserService.class);

        rmiProxyFactory.setCacheStub(true);
        rmiProxyFactory.setRefreshStubOnConnectFailure(true);
        rmiProxyFactory.setLookupStubOnStartup(false);

        return rmiProxyFactory;
    }
}
