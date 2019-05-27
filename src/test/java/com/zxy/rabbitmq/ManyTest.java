package com.zxy.rabbitmq;

import com.zxy.rabbit.many.ZxySender;
import com.zxy.rabbit.many.ZxySender2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManyTest {
	@Autowired
	private ZxySender zxySender;

	@Autowired
	private ZxySender2 zxySender2;

	@Test
	public void oneToMany() throws Exception {
		for (int i=0;i<100;i++){
			zxySender.send(i);
		}
	}

	@Test
	public void manyToMany() throws Exception {
		for (int i=0;i<100;i++){
			zxySender.send(i);
			zxySender2.send(i);
		}
	}

}