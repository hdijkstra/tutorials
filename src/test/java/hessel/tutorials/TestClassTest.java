/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hessel.tutorials;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author hessel
 */
public class TestClassTest {
    private TestClass testClass;
    
    @Before
    public void setup() {
        testClass = new TestClass();
    }

    @Test
    public void hello() {
        assertEquals("hello", testClass.hello());
    }
    
    @Test
    public void hello2() {
        assertEquals("hello2", testClass.hello2());
    }
}
