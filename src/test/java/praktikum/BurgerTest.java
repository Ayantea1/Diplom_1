package praktikum;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static praktikum.IngredientType.SAUCE;


@RunWith(MockitoJUnitRunner.class)
public class BurgerTest extends TestCase {


 @Mock
 Ingredient ingredient;
 @Mock
 Bun bun;

 @Test
    public void testAddIngredient() {
     Burger burger = new Burger();
     burger.addIngredient(ingredient);
     assertEquals(1, burger.ingredients.size());
    }
@Test
    public void testRemoveIngredient() {
    Burger burger = new Burger();
    burger.addIngredient(ingredient);
    burger.removeIngredient(0);
    assertEquals(0, burger.ingredients.size());
    }

@Test
    public void testGetPrice() {
        Mockito.when(bun.getPrice()).thenReturn(200F);
    Mockito.when(ingredient.getPrice()).thenReturn(150F);
    Burger burger = new Burger();
    burger.setBuns(bun);
    burger.addIngredient(ingredient);
    assertEquals(550F,burger.getPrice(),0);
    }

    @Test
    public void testGetReceipt() {
        Burger burger = new Burger();
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        Mockito.when(bun.getName()).thenReturn("pan");
        Mockito.when(ingredient.getType()).thenReturn(SAUCE);
        Mockito.when(ingredient.getName()).thenReturn("test");
        Mockito.when(burger.getPrice()).thenReturn(150F);
        assertEquals(String.format("(==== %s ====)%n= %s %s =%n(==== %s ====)%n%nPrice: %f%n","pan","sauce","test","pan",150F),burger.getReceipt());
    }
}