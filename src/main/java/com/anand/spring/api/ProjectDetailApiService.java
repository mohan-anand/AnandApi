package com.anand.spring.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api")
public class ProjectDetailApiService
{

   @RequestMapping(value = "/getDetails", method = RequestMethod.GET)
   @ResponseStatus(HttpStatus.OK)
   public String getDetails()
   {
      return "Version 1.0";
   }
}
