package praktikum;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static praktikum.IngredientType.*;


public class IngredientTest extends TestCase {


    @Test
    public void testGetPrice() {
        var ingridient = new Ingredient(SAUCE, "test",123);
        assertEquals(123,ingridient.getPrice(),0);
    }
    @Test
    public void testTestGetName() {
        var ingridient = new Ingredient(SAUCE, "test",123);
        assertEquals ("test", ingridient.getName());
    }
    @Test
    public void testGetType() {
        var ingridient = new Ingredient(FILLING, "test",123);
        assertEquals (FILLING, ingridient.getType());
    }
}