package com.lakshithafdo.jenkinsDemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(HelloController.class)
class JenkinsDemoApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private HelloService helloService;


	@Test
	public void helloControllerTest() throws Exception{

		ResultActions response = mockMvc.perform(get("/api/hello"));
		response.andExpect(status().isOk())
				.andDo(print());

	}

}
