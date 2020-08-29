import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Before
    public void beforeTestDo() {
        System.out.println("Antes de la prueba");
    }

    @Test
    public void testGetHello(){
        System.out.println("Durante la prueba");
        assertEquals("Hello Mundito", new Hello().getHello());
    }

    @After
    public void afterTestDo(){
        System.out.println("Despues de la prueba");
    }
}
