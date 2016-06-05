package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 03.06.16.
 */

@Component("divide")
public class ComputeWithDivideService implements ComputeService {
    @Override
    public Double operationOne(Integer a, Integer b) {
        return Double.valueOf(a-b);
    }
    @Override
    public Double operationTwo(Integer a, Integer b) {
        return Double.valueOf((double)a / (double)b);
    }
}
