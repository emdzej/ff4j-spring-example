package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 03.06.16.
 */

public class LeftRouteStrategy extends AbstractRouteStrategy {
    @Override
    public String getDirection() {
        return wrapDirection("left");
    }
}
