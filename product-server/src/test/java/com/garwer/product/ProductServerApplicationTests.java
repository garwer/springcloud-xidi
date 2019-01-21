package com.garwer.product;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServerApplicationTests {
	@Autowired
	private AmqpTemplate amqpTemplate;

	@Test
	public void contextLoads() {
	}

	@Test
	public void sendAmq() {
		amqpTemplate.convertAndSend("linjw","now" + new Date());
	}


}

