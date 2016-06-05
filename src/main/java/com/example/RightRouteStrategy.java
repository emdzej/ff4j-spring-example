package com.example;

import org.ff4j.aop.FeatureAdvisor;
import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 03.06.16.
 */

public class RightRouteStrategy extends AbstractRouteStrategy {
    @Override
    public String getDirection() {
        return wrapDirection("right");

    }
}
