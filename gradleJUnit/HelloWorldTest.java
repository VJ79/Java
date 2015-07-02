package org.gradle.example.simple;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
@Test
public void testHelloWorld() throws Exception {
assertEquals("Hello, World", HelloWorld.result());
}
}

 