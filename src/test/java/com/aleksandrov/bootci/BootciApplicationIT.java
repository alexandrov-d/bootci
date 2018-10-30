package com.aleksandrov.bootci;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureMockMvc
@SpringBootTest

public class BootciApplicationIT {

	@Test
	public void contextLoads1() {
		assert(true);
	}


	@Test
	public void contextLoads2() {
		assert(true);
	}


	@Test
	public void contextLoads3() {
		assert(true);
	}

}
