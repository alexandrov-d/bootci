package com.aleksandrov.bootci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootConfiguration
public class MvcConfig implements WebMvcConfigurer {

    private String resourceUrl;



    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        registry.addResourceHandler("/players/**").addResourceLocations("file:" + resourceUrl + "/players/");
        registry.addResourceHandler("/images/**").addResourceLocations("file:" + resourceUrl + "/resources/images/");
    }

}
