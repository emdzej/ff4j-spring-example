package com.example;

import org.ff4j.aop.FeatureAutoProxy;
import org.junit.Assert;
import org.ff4j.FF4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by emdzej on 03.06.16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class RouteStrategyTests {
    @Autowired
    private FF4j ff4j;

    @Autowired
    private RouteStrategy routeStrategy;

    @Test
    public void shouldFlip() {
        Assert.assertFalse(ff4j.check("right"));
        Assert.assertTrue("go left".equals(routeStrategy.getDirection()));

        ff4j.enable("right");
        Assert.assertTrue(ff4j.check("right"));
        Assert.assertTrue("go right".equals(routeStrategy.getDirection()));

    }
}
