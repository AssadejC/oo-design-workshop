import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloWorldTest {
    @Test
    public void helloKaran(){
        HelloWorld helloWorld = new HelloWorld();

        String actualResult = helloWorld.greeting("Karan");

        assertEquals("Hello Karan", actualResult);
    }
}
