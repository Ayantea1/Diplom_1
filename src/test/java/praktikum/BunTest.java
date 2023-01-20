package praktikum;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class BunTest extends TestCase {

    @Parameterized.Parameter()
    public String name;
    @Parameterized.Parameter(1)
    public float price;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"test", 123},
                {"/",0},
                {"",0.01f},
                {null,999999999.99f},
                {"Оооооооооооооооооооооооооочччччччччччччччччччччччееееееееееееееееееееееннннннннннннннннннннннннннььььььььььььььь " +
                        "ддддддддддддддддддддддддлллллллллллллллииииииииииииииииннннннннннннннннннннннннннннноооооооооооеееееееееееееееее",-1}
        };
    }

@Test
    public void testTestGetName() {
        var bun = new Bun (name,price);
        assertEquals(name,bun.getName());
    }
@Test
public void testGetPrice() {
        var bun = new Bun (name,price);
        assertEquals(price,bun.getPrice(),0);
    }
}