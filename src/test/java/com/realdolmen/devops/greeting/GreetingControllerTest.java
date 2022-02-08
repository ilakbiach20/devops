package com.realdolmen.devops.greeting;

import com.realdolmen.devops.greeting.GreetingController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class GreetingControllerTest {
    @InjectMocks
    private GreetingController greetingController;

    @Test
    void whenCallingGrettingMethod_returnHello(){
        String answer = greetingController.hello();
        assertThat(answer).isEqualTo("Hello");
    }
}
