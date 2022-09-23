package com.secure.controller;


import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.util.Base64Utils;

import com.security.entity.Employee;

@RunWith(SpringRunner.class)
@WebMvcTest({AppController.class})
@ActiveProfiles(value = "true")
public class AppControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Value("${employee.get.url}")
	String geturl;
	
	@Value("${employee.post.url}")
	String posturl;
	
	@Value("${employee.put.url}")
	String puturl;
	
	@Value("${employee.delete.url}")
	String deleteurl;
	
	@Value("${user.user1.username}")
	String username1;
	
	@Value("${user.user1.password}")
	String password1;
	
	@Value("${user.user1.username}")
	String admin_name1;
	
	@Value("${user.user1.password}")
	String admin_password;
	
	@Test
	public void testEmployeeGet() throws Exception {
		ResultActions responseEntity = processApiRequest(geturl, HttpMethod.GET, null,null, username1, password1);
		responseEntity.andExpect(status().isOk());
		String result = responseEntity.andReturn().getResponse().getContentAsString();
		assertEquals("get employee", result);
		
	}
	
	public ResultActions processApiRequest(String api, HttpMethod methodtype,String name, Employee employee,
		String username,String password){
		
		ResultActions response = null;
		String secret = "Basic" + Base64Utils.encodeToString((username + ":" + password).getBytes());
		try {
			switch(methodtype) {
			case GET :
				response = mockMvc.perform(get(api).header(HttpHeaders.AUTHORIZATION, secret));
				break;
			}
		}
	
		catch(Exception E) {
			E.printStackTrace();
			fail();
		}
		
		return response;
	}
}
