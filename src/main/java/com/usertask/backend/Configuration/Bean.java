package com.usertask.backend.Configuration;

import com.usertask.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Bean {

    @org.springframework.context.annotation.Bean
    public List<User> getUserList(){
        return new ArrayList<>();
    }

}
