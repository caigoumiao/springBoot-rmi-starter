package com.miao.rmiserver.config;

import api.User;
import api.UserService;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DefaultUserServiceImpl implements UserService
{
    @Override
    public String hello()
    {
        return "hello client";
    }

    @Override
    public User getUser()
    {
        User u=new User();
        u.setName("miao");
        u.setAge(18);
        u.setBirth(new Date());
        return u;
    }
}
