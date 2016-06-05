package com.example;

import org.ff4j.aop.Flip;


/**
 * Created by emdzej on 03.06.16.
 */

public interface ComputeService {
    Double operationOne(Integer a, Integer b);

    @Flip(name="divide", alterBean="divide")
    Double operationTwo(Integer a, Integer b);
}
