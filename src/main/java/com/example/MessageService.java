package com.example;

import org.ff4j.aop.Flip;

/**
 * Created by emdzej on 02.06.16.
 */

@Flip(name="hello", alterBean="hello")
public interface MessageService {
    String showMessage();
    String showOtherMessage();
}
