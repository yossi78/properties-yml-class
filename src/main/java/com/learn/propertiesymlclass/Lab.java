package com.learn.propertiesymlclass;
import com.learn.propertiesymlclass.properties.EhCacheProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;


@Service
public class Lab {

    private EhCacheProperties ehCacheProperties;

    @Autowired
    public Lab(EhCacheProperties ehCacheProperties) {
        this.ehCacheProperties = ehCacheProperties;
    }

    @PostConstruct
    public void test(){
        System.out.println("xx");
    }


}
