package com.example;

import org.ff4j.aop.FeatureAutoProxy;

/**
 * Created by emdzej on 03.06.16.
 */
public abstract class AbstractRouteStrategy implements RouteStrategy {

    protected String wrapDirection(String direction) {
        return "go " + direction;

    }
}
