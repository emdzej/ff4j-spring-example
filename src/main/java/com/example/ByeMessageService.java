package com.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * Created by emdzej on 02.06.16.
 */

@Component
@Primary
public class ByeMessageService implements MessageService {
    @Override
    public String showMessage() {
        return "bye";
    }

    @Override
    public String showOtherMessage() {
        return "goodbye";
    }

}
