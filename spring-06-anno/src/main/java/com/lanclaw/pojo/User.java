package com.lanclaw.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//相当于 <bean id="user" class="com.lanclaw.pojo.User"/>
@Component
@Scope("prototype")
public class User {

    //相当于 <property name="name" value="lanclaw"/>
    @Value("lanclaw")
    private String name;
}
