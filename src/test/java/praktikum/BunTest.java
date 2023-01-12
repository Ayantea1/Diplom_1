package praktikum;

import junit.framework.TestCase;
import org.junit.Test;

public class BunTest extends TestCase {

@Test
    public void testTestGetName() {
        var bun = new Bun ("test",123);
        assertEquals("test",bun.getName());
    }
@Test
public void testGetPrice() {
        var bun = new Bun ("test",123);
        assertEquals(123,bun.getPrice(),0);
    }
}