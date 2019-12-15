/*
 */
package com.example.coveragetest.controller;

import static junit.framework.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author cjayawickrema
 */
public class ControllerTest {

    /**
     * Test of sayHello method, of class Controller.
     */
    @Test
    public void testSayHello() {
        System.out.println("sayHello");
        String name = "Messi";
        String age = null;
        Controller instance = new Controller();
        String expResult = "Hello Messi";
        String result = instance.sayHello(name, age);
        assertEquals(expResult, result);
    }

}
