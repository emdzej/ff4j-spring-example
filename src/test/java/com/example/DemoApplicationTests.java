package com.example;

import org.junit.Assert;
import org.ff4j.FF4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
//@ContextConfiguration(locations = {"classpath:*applicationContext.xml"})
public class DemoApplicationTests {

	@Autowired
	private FF4j ff4j;

	@Autowired private MessageService messageService;

	@Test
	public void featureFlips() {
		Assert.assertFalse(ff4j.check("hello"));
		Assert.assertTrue("bye".equals(messageService.showMessage()));
		Assert.assertTrue("goodbye".equals(messageService.showOtherMessage()));
		ff4j.enable("hello");
		Assert.assertTrue(ff4j.check("hello"));
		Assert.assertTrue("hello".equals(messageService.showMessage()));
		Assert.assertTrue("hi".equals(messageService.showOtherMessage()));
	}

}
