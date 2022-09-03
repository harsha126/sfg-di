package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInfectedControllerTest {

    PropertyInfectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInfectedController();

        controller.greetingService = new ConstructorGreetingService();
    }

    @Test
    void getGreetings(){
        System.out.println(controller.getGreetings());
    }

}