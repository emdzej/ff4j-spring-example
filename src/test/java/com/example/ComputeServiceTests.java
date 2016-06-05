package com.example;

import org.junit.Assert;
import org.ff4j.FF4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by emdzej on 03.06.16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class ComputeServiceTests {
    @Autowired
    private FF4j ff4j;

    @Autowired
    private ComputeService computeService;

    @Test
    public void onlyMethodShouldFlip() {
        Assert.assertFalse(ff4j.check("divide"));
        Assert.assertEquals(3, computeService.operationOne(1, 2), 0);
        Assert.assertEquals(2,  computeService.operationTwo(1, 2), 0);
        ff4j.enable("divide");
        Assert.assertTrue(ff4j.check("divide"));
        Assert.assertEquals(3, computeService.operationOne(1, 2), 0);
        Assert.assertEquals(0.5,  computeService.operationTwo(1, 2), 0);

    }

}
