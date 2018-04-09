package com.anand.spring;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.servlet.ServletContext;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AnandSpringDemoApplication.class})
@WebAppConfiguration
public class ProjectDetailServiceTest
{
   @Autowired
   private WebApplicationContext wac;

   private MockMvc mockMvc;

   @Before
   public void setup() throws Exception
   {
      this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
   }

   @Test
   public void givenWac_whenServletContext_thenItProvidesGreetController()
   {
      ServletContext servletContext = wac.getServletContext();

      Assert.assertNotNull(servletContext);
      Assert.assertTrue(servletContext instanceof MockServletContext);
      Assert.assertNotNull(wac.getBean("projectDetailApiService"));
   }

   @Test
   public void givengetDetailsURI_then_ReturnsValidVersion() throws Exception
   {
      RequestBuilder request = MockMvcRequestBuilders.get("/api/getDetails");

      MvcResult mvcResult = this.mockMvc.perform(request).andExpect(status().isOk()).andReturn();


   }

}
