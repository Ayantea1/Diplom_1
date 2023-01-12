package praktikum;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static praktikum.IngredientType.*;

@RunWith(Parameterized.class)
public class IngredientTypeTest extends TestCase {

    @Parameterized.Parameter()
    public String type;

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][]{
                {"SAUCE"},
                {"FILLING"}
        };
    }
    @Test
    public void testValuesOf(){
        assertTrue(IngredientType.valueOf(type) == SAUCE || IngredientType.valueOf(type)==FILLING);
    }

  //  public void testValues() {
   //     var arr  = Arrays.toString(IngredientType.values());
   //     assertEquals("[SAUCE, FILLING]", arr);
   // }


}