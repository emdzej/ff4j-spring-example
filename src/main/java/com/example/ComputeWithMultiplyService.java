package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 03.06.16.
 */
@Component
@Primary
public class ComputeWithMultiplyService  implements   ComputeService {
    @Override
    public Double operationOne(Integer a, Integer b) {
        return Double.valueOf(a +  b);
    }
    @Override
    public Double operationTwo(Integer a, Integer b) {
        return Double.valueOf(a * b);
    }
}
