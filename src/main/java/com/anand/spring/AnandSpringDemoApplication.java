package com.anand.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class AnandSpringDemoApplication extends SpringBootServletInitializer
{

   @Override
   protected SpringApplicationBuilder configure(SpringApplicationBuilder application)
   {
      return application.sources(AnandSpringDemoApplication.class);
   }

   public static void main(String[] args)
   {
      SpringApplication.run(AnandSpringDemoApplication.class, args);
   }
}
