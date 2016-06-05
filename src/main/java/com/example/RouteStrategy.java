package com.example;

import org.ff4j.aop.Flip;

/**
 * Created by emdzej on 03.06.16.
 */

@Flip(name = "right", alterBean = "right")
public interface RouteStrategy {
    String getDirection();
}
