package com.example;

import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 02.06.16.
 */
@Component("hello")
public class HelloMessageService implements MessageService {
    @Override
    public String showMessage() {
        return "hello";
    }

    @Override
    public String showOtherMessage() {
        return "hi";
    }
}
